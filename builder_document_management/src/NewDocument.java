class NewDocument {
    public static void main(String[] args) {
        try {
            Document normalDoc = new NormalDoc();
            normalDoc.setExtension();
            normalDoc.setEncryption();
            normalDoc.saveToFile("This is a normal document.");

            Document confidentialDoc = new ConfidentialDoc();
            confidentialDoc.setExtension();
            confidentialDoc.setEncryption();
            confidentialDoc.saveToFile("This is a confidential document.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
