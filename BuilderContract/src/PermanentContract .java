class PermanentContract implements Contract {
    private String contractID;
    private String propertyID;
    private String tenantID;
    private double rentAmount;

    @Override
    public void buildContractID() { this.contractID = "PERM123"; }
    
    @Override
    public void buildPropertyID() { this.propertyID = "PROP001"; }
    
    @Override
    public void buildTenantID() { this.tenantID = "TEN001"; }
    
    @Override
    public void buildRentAmount() { this.rentAmount = 5000.0; }

    @Override
    public Contract signContract() {
        System.out.println("Permanent Contract Signed!");
        return this;
    }
}
