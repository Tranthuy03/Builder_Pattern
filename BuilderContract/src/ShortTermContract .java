class ShortTermContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID() { this.contractID = "SHORT789"; }

    @Override
    public void buildPropertyID() { this.propertyID = "PROP003"; }

    @Override
    public void buildTenantID() { this.tenantID = "TEN003"; }

    @Override
    public void buildRentAmount() { this.rentAmount = 3000.0; }

    @Override
    public Contract signContract() {
        System.out.println("Short-Term Contract Signed!");
        return this;
    }
}
