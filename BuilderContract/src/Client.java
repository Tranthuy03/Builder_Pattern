class Client {
    public static void main(String[] args) {
        Contract permanentContract = new PermanentContract();
        permanentContract.buildContractID();
        permanentContract.buildPropertyID();
        permanentContract.buildTenantID();
        permanentContract.buildRentAmount();
        permanentContract.signContract();

        Contract longTermContract = new LongTermContract();
        longTermContract.buildContractID();
        longTermContract.buildPropertyID();
        longTermContract.buildTenantID();
        longTermContract.buildRentAmount();
        longTermContract.signContract();
        
        Contract shortTermContract = new ShortTermContract();
        shortTermContract.buildContractID();
        shortTermContract.buildPropertyID();
        shortTermContract.buildTenantID();
        shortTermContract.buildRentAmount();
        shortTermContract.signContract();
    }
}
