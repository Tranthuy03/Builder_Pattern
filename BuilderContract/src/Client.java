class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter contract type (1: Permanent, 2: Long-Term, 3: Short-Term): ");
        int type = scanner.nextInt();
        scanner.nextLine(); 
        
        Contract contract = null;

        if (type == 1) {
            contract = new PermanentContract();
        } else if (type == 2) {
            contract = new LongTermContract();
        } else if (type == 3) {
            contract = new ShortTermContract();
        } else {
            System.out.println("Invalid contract type.");
            scanner.close();
            return;
        }
        
        System.out.print("Enter Contract ID: ");
        String contractID = scanner.nextLine();
        contract.buildContractID(contractID);
        
        System.out.print("Enter Property ID: ");
        String propertyID = scanner.nextLine();
        contract.buildPropertyID(propertyID);
        
        System.out.print("Enter Tenant ID: ");
        String tenantID = scanner.nextLine();
        contract.buildTenantID(tenantID);
        
        System.out.print("Enter Rent Amount: ");
        double rentAmount = scanner.nextDouble();
        contract.buildRentAmount(rentAmount);
        
        contract.signContract();

        scanner.close();
    }
}

