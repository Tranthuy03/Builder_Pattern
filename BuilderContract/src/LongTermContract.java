class LongTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID() { this.contractID = "LONG456"; }

    @Override
    public void buildPropertyID() { this.propertyID = "PROP002"; }

    @Override
    public void buildTenantID() { this.tenantID = "TEN002"; }

    @Override
    public void buildRentAmount() { this.rentAmount = 7000.0; }

    @Override
    public Contract signContract() {
        System.out.println("Long-Term Contract Signed!");
        return this;
    }
}
