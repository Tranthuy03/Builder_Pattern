class ShortTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID(String contractID) { this.contractID = contractID; }

    @Override
    public void buildPropertyID(String propertyID) { this.propertyID = propertyID; }

    @Override
    public void buildTenantID(String tenantID) { this.tenantID = tenantID; }

    @Override
    public void buildRentAmount(double rentAmount) { this.rentAmount = rentAmount; }

    @Override
    public Contract signContract() {
        System.out.println("Short-Term Contract Signed: " + contractID);
        return this;
    }
}
