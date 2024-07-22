package dk.toldst.eutk.as4client;

public class As4ClientResponseDto {

    private byte[] rawSoapResponse;
    private byte[] firstAttachment;
    private String reftoOriginalID;


    public byte[] getFirstAttachment() {
        return firstAttachment;
    }

    public void setFirstAttachment(byte[] firstAttachment) {
        this.firstAttachment = firstAttachment;
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
