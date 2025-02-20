public class ClientDocManagement {

    public static void main(String[] args) {
        NewDocument();
    }

    public static void NewDocument() {
        Document normalDocument = new NormalDocBuilder()
                .setExtension()
                .setEncryption()
                .buildDoc();
        normalDocument.showInfo();

        Document confidentialDocument = new ConfidentialDocBuilder()
                .setExtension()
                .setEncryption()
                .buildDoc();
        confidentialDocument.showInfo();
    }
}