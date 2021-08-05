package dk.toldst.eutk.as4client.builder.support;

import dk.toldst.eutk.as4client.As4Client;
import dk.toldst.eutk.as4client.As4ClientInstance;
import dk.toldst.eutk.as4client.builder.As4ClientBuilder;
import dk.toldst.eutk.as4client.builder.interfaces.As4Optionals;
import dk.toldst.eutk.as4client.builder.interfaces.As4SetCrypto;
import dk.toldst.eutk.as4client.builder.interfaces.As4SetEndpoint;
import dk.toldst.eutk.as4client.builder.interfaces.As4SetPasswordTokenDetails;
import dk.toldst.eutk.as4client.as4.As4DtoCreator;
import dk.toldst.eutk.as4client.as4.As4HttpClient;
import dk.toldst.eutk.as4client.as4.SecurityService;
import dk.toldst.eutk.as4client.userinformation.B2BException;
import dk.toldst.eutk.as4client.userinformation.As4UserInformation;
import dk.toldst.eutk.as4client.userinformation.As4UserInformationType;
import dk.toldst.eutk.as4client.utilities.JaxbThreadSafe;
import org.apache.wss4j.common.crypto.Crypto;
import org.apache.wss4j.common.crypto.CryptoFactory;
import org.apache.wss4j.common.crypto.Merlin;
import org.apache.wss4j.common.ext.WSSecurityException;
import org.apache.xml.security.Init;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import java.net.URI;
import java.security.KeyStoreException;
import java.security.cert.X509Certificate;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class As4ClientBuilderInstance implements As4ClientBuilder {

    private As4SetPasswordTokenDetailsInstance as4SetUsernameTokenDetailsInstance;
    private As4SetCryptoInstance as4SetCryptoInstance;
    private As4SetEndpointInstance as4SetEndpointInstance;

    //Username -> Client
    public As4Client build() {

        JAXBContext jaxbContext = null;
        try {
            jaxbContext = JAXBContext.newInstance("org.oasis_open.docs.ebxml_msg.ebms.v3_0.ns.core._200704");
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        SecurityService securityService = new SecurityService(
                as4SetCryptoInstance.username,
                as4SetUsernameTokenDetailsInstance.password,
                as4SetCryptoInstance.crypto,
                as4SetCryptoInstance.cryptoProperties
        );

        JaxbThreadSafe jaxbThreadSafe = new JaxbThreadSafe(jaxbContext);


        As4HttpClient as4HttpClient = new As4HttpClient(jaxbThreadSafe, securityService, as4SetEndpointInstance.urlBase.resolve("/exchange/"+as4SetCryptoInstance.username));
        As4DtoCreator as4DtoCreator = new As4DtoCreator(as4SetCryptoInstance.username + "_AS4", "SKAT-MFT-AS4");
        As4ClientInstance as4Client = new As4ClientInstance(as4DtoCreator, as4HttpClient);
        return as4Client;
    }

    @Override
    public As4Optionals optionals() {
        return new As4OptionalsBuilder(this);
    }

    //Builder -> Endpoint
    public As4SetEndpoint builder() {
        as4SetEndpointInstance = new As4SetEndpointInstance();
        return as4SetEndpointInstance;
    }

    private class As4SetPasswordTokenDetailsInstance implements As4SetPasswordTokenDetails {
        private String password;

        @Override
        public As4ClientBuilder setPassword(String password) {
            this.password = password;
            return As4ClientBuilderInstance.this;
        }
    }

    //Crypto -> User
    private class As4SetCryptoInstance implements As4SetCrypto {
        private Crypto crypto;
        private Properties cryptoProperties;
        private String username;

        /**
         * Use this for generic loading of crypto properties. This should be used if your project doesn't have resource loading, or similar.
         * @param filepath the file to read security properties from.
         * @return Next step in the builder pattern.
         */
        @Override
        public As4SetPasswordTokenDetails setCrypto(String filepath) {
            System.out.println("running crypto setup");
            try {
                Init.init();
                cryptoProperties = CryptoFactory
                        .getProperties(filepath, CryptoFactory.class.getClassLoader());
                crypto = CryptoFactory.getInstance(cryptoProperties);

                var a = new X509Certificate[] { (X509Certificate)(((Merlin) crypto).getKeyStore().getCertificate(cryptoProperties.getProperty("org.apache.wss4j.crypto.merlin.keystore.alias"))) };
                var userInfo = mapCertificateToUserInformation(a);
                username = mapUserInformationToUsernameString(userInfo);
            } catch (WSSecurityException | KeyStoreException | B2BException e) {
                int i = 0;
                //TODO BRJ Fix this catch
            }
            as4SetUsernameTokenDetailsInstance = new As4SetPasswordTokenDetailsInstance();
            return as4SetUsernameTokenDetailsInstance;
        }



        /**
         * Use this to set the crypto, if your project has the ability to load resources.
         * @param cryptoProps
         * @return
         */
        @Override
        public As4SetPasswordTokenDetails setCrypto(Crypto cryptoProps) {
            crypto = cryptoProps;

            as4SetUsernameTokenDetailsInstance = new As4SetPasswordTokenDetailsInstance();
            return as4SetUsernameTokenDetailsInstance;
        }
    }

    //Endpoint -> Crypto
    private class As4SetEndpointInstance implements As4SetEndpoint {
        private java.net.URI urlBase;

        @Override
        public As4SetCrypto setEndpoint(java.net.URI url) {
            this.urlBase = url;
            as4SetCryptoInstance = new As4SetCryptoInstance();
            return as4SetCryptoInstance;
        }
    }

    public static String mapUserInformationToUsernameString(As4UserInformation information)
    {
        String res = "";
        res += "CVR_" + information.getCvr() + "_";
        switch (information.getType()) {
            case RID:
                res += "RID"; break;
            case UID:
                res += "UID"; break;
            case PID:
                res += "PID"; break;
            case FID:
                res += "FID"; break;
            case NID:
                res += "NID"; break;
        }
        res += "_" +  information.getId();
        return res;
    }


    public static As4UserInformation mapCertificateToUserInformation(final X509Certificate[] certificates) throws B2BException {
        if (certificates == null || certificates.length < 1 || certificates[0] == null) {
            throw new B2BException("The certificate array does not have any certificates");
        }
        // Get first certificate in chain and extract the serial number
        final X509Certificate certificate = certificates[0];
        String serialNumber;
        serialNumber = certificate.getSubjectDN().getName();
        if (!(serialNumber.contains("SERIALNUMBER") || serialNumber.startsWith("CN=CVR:"))) {
            throw new B2BException("Attribute for serial number was not found in the certificate");
        }
        // We support all four types of OCES certificates. Examples:
        // SERIALNUMBER = CVR:30808460-UID:1237552804997
        // SERIALNUMBER = CVR:30808460-RID:1237553529373
        // SERIALNUMBER = CVR:30808460-FID:1255692730737
        // SERIALNUMBER = PID:9208-2002-2-735089857982
        // CN=CVR:12635729
        As4UserInformation userInformation;
        // Try to get a RID ("medarbejdercertifikat")
        Matcher matcherSN = Pattern.compile("SERIALNUMBER=CVR:(\\w+)-RID:(\\w+)").matcher(serialNumber);
        if (matcherSN.find()) {
            final String cvr = matcherSN.group(1);
            final String rid = matcherSN.group(2);
            userInformation = new As4UserInformation(As4UserInformationType.RID, rid, cvr);
        } else {
            // Try to get a UID ("virksomhedscertifikat")
            matcherSN = Pattern.compile("SERIALNUMBER=CVR:(\\w+)-UID:(\\w+)").matcher(serialNumber);
            if (matcherSN.find()) {
                final String cvr = matcherSN.group(1);
                final String uid = matcherSN.group(2);
                userInformation = new As4UserInformation(As4UserInformationType.UID, uid, cvr);
            } else {
                // Try to get a PID ("personcertifikat")
                matcherSN = Pattern.compile("PID:(\\w+)").matcher(serialNumber);
                if (matcherSN.find()) {
                    final String pid = matcherSN.group(1);
                    userInformation = new As4UserInformation(As4UserInformationType.PID, pid, null);
                } else {
                    // Try to get a FID ("funktionscertifikat")
                    matcherSN = Pattern.compile("SERIALNUMBER=CVR:(\\w+)-FID:(\\w+)").matcher(serialNumber);
                    if (matcherSN.find()) {
                        final String cvr = matcherSN.group(1);
                        final String fid = matcherSN.group(2);
                        userInformation = new As4UserInformation(As4UserInformationType.FID, fid, cvr);
                    } else {
                        // Try to get a CVR only. No other IDs
                        matcherSN = Pattern.compile("CN=CVR:(\\w+)").matcher(serialNumber);
                        if (matcherSN.find()) {
                            final String cvr = matcherSN.group(1);
                            userInformation = new As4UserInformation(As4UserInformationType.NID, null, cvr);
                        } else {
                            // This is probably not an OCES certificate
                            throw new B2BException("Could not find a supported OCES type (RID, UID, PID or FID) in the serial number: " + serialNumber);
                        }
                    }
                }
            }
        }
        return userInformation;
    }




}
