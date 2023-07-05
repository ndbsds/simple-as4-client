package dk.toldst.eutk.as4client;

public class As4ClientResponseDto {

    private byte[] rawSoapResponse;
    private String FirstAttachment;
    private String reftoOriginalID;


    public String getFirstAttachment() {
        return FirstAttachment;
    }

    public void setFirstAttachment(String firstAttachment) {
        FirstAttachment = firstAttachment;
    }

    public String getReftoOriginalID() {
        return reftoOriginalID;
    }

    public void setReftoOriginalID(String reftoOriginalID) {
        this.reftoOriginalID = reftoOriginalID;
    }

    public byte[] getRawSoapResponse() {
        return rawSoapResponse;
    }

    public void setRawSoapResponse(byte[] rawSoapResponse) {
        this.rawSoapResponse = rawSoapResponse;
    }
}
