package dk.toldst.eutk.as4client;

import org.apache.wss4j.common.crypto.Crypto;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;

public class As4ClientInstance implements As4Client {

    private Crypto crypto;
    private String username;
    private String password;
    private URL url;

    public Crypto getCrypto() {
        return crypto;
    }

    public void setCrypto(Crypto crypto) {
        this.crypto = crypto;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }


    @Override
    public String executePush(String service, String action, String message) {
        String messageId = UUID.randomUUID().toString();





        return null;
    }

    @Override
    public String executePull() {
        return null;
    }
}
