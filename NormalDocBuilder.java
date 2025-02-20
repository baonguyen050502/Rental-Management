public class NormalDocBuilder implements DocumentBuilder {
    private Document document = new Document();

    @Override
    public DocumentBuilder setExtension() {
        document.setExtension(".txt");
        return this;
    }

    @Override
    public DocumentBuilder setEncryption() {
        document.setEncryption("None");
        return this;
    }

    @Override
    public Document buildDoc() {
        return document;
    }
}