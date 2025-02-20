public class Document {
    private String extension;
    private String encryption;

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public void setEncryption(String encryption) {
        this.encryption = encryption;
    }

    public void showInfo() {
        System.out.println("Document Extension: " + extension);
        System.out.println("Encryption: " + encryption);
    }
}