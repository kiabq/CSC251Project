public class PolicyHolder {
    public static int policyHolderCount = 0;
    private InsurancePolicy policyHolder = new InsurancePolicy();

    PolicyHolder(InsurancePolicy policy) {
       policyHolder = policy;
    }

    /**
     * Sets the policy holder
     * @param policy
     */
    public void setPolicyHolder(InsurancePolicy policy) {
        this.policyHolder = policy;
    }

    /**
     * Returns a reference to the policy holder's insurance policy
     * @return
     */
    public InsurancePolicy getPolicyHolder() {
        return new InsurancePolicy(
            policyHolder.getPolicyNumber(),
            policyHolder.getAge(),
            policyHolder.getHeightInches(),
            policyHolder.getWeightPounds(),
            policyHolder.getProviderName(),
            policyHolder.getFirstName(),
            policyHolder.getLastName(),
            policyHolder.getSmokingStatus()
        );
    }

    public String toString() {
        return policyHolder.toString();
    }
}
