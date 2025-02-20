class NewDocument {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter document type (normal/confidential): ");
        String type = scanner.nextLine().trim().toLowerCase();

        System.out.println("Enter document content: ");
        String content = scanner.nextLine();

        Document document;

        if (type.equals("confidential")) {
            document = new ConfidentialDoc();
        } else {
            document = new NormalDoc();
        }

        document.setExtension();
        document.setEncryption();
        try {
            document.saveToFile(content);
        } catch (Exception e) {
            e.printStackTrace();
        }

    
    }
}
