public class InsurancePolicy {
    private int policyNumber, age;
    private double heightInches, weightPounds;
    // note: smokingStatus would probably be best as an enum?
    private String providerName, firstName, lastName, smokingStatus;

    InsurancePolicy() {
        policyNumber = 0;
        age = 0;
        heightInches = 0.0;
        weightPounds = 0.0;
        providerName = "";
        firstName = "";
        lastName = "";
        smokingStatus = "non-smoker";
    }

    InsurancePolicy(
        int policyNumber, 
        int age, 
        double heightInches,
        double weightPounds,
        String providerName,
        String firstName,
        String lastName,
        String smokingStatus
    ) {
       this.policyNumber = policyNumber;
       this.age = age;
       this.heightInches = heightInches;
       this.weightPounds = weightPounds;
       this.providerName = providerName;
       this.firstName = firstName;
       this.lastName = lastName;
       this.smokingStatus = smokingStatus;
    }

    /* Mutators and Accessor Methods */
    /**
     * Sets the policy number
     * @param policyNumber
     */
    public void setPolicyNumber (int policyNumber) { this.policyNumber = policyNumber; }
    /**
     * Gets the policy number
     * @return
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policyholder's age.
     * @param age
     */
    public void setAge(int age) { this.age = age; }
    /**
     * Gets the policholder's age.
     * @return
     */
    public int getAge() { 
        return age;
    }

    /**
     * Sets the policyholder's height in inches.
     * @param height
     */
    public void setHeightInches(double height) { this.heightInches = height; }
    /**
     * Gets the policyholder's height in inches.
     * @return
     */
    public double getHeightInches() {
        return heightInches;
    }

    /**
     * Sets the policyholder's weight in pounds.
     * @param weight
     */
    public void setWeightPounds(double weight) { this.weightPounds = weight; }
    /**
     * Gets the policholder's weight in pounds.
     * @return
     */    
    public double getWeightPounds() {
        return weightPounds;
    }

    /**
     * Sets the policyholder's provider name.
     * @param providerName
     */
    public void setProviderName(String providerName) { this.providerName = providerName; }
    /**
     * Gets the policyholder's provider name.
     * @return
     */
    public String getProviderName() {
        return providerName;
    }
    
    /**
     * Sets the policyholder's first name.
     * @param firstName
     */
    public void setFirstName(String firstName) { this.firstName = firstName; }
    /**
     * Gets the policyholder's first name. 
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the policyholder's last name.
     * @param lastName
     */
    public void setLastName(String lastName) { this.lastName = lastName; }
    /**
     * Gets the policyholder's last name. 
     * @return
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the policyholder's smoking status.
     * @param smokingStatus
     */
    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    /**
     * Gets the policyholder's smoking status.
     * @return
     */    
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /* Class Methods */
    /**
     * Returns the policyholder's BMI. This is calculated by taking the
     * product of their weight and 703, and dividing it by the product of 
     * height in inches squared. 
     * 
     * @return
     */
    public double calculatePolicyHolderBMI() {
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    /**
     * Returns the calculated cost of the policy. 
     * 
     * The three primary factors that raise 
     * the cost is age being greater than or equal to 50, 
     * the policyholder being a smoker, and having a BMI of over 35. 
     * @return
     */
    public double calculatePolicyCost() {
        double baseFee = 600;
        double bmi = calculatePolicyHolderBMI();

        if (age > 50) {
            baseFee += 75;
        }

        if (smokingStatus.equals("smoker")) {
            baseFee += 100;
        }

        if (bmi > 35) {
            baseFee += (bmi - 35) * 20;
        }

        return baseFee;
    }
}