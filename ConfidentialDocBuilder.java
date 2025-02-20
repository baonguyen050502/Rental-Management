public class ConfidentialDocBuilder implements DocumentBuilder {
    private Document document = new Document();

    @Override
    public DocumentBuilder setExtension() {
        document.setExtension(".zip");
        return this;
    }

    @Override
    public DocumentBuilder setEncryption() {
        document.setEncryption("AES");
        return this;
    }

    @Override
    public Document buildDoc() {
        return document;
    }
}