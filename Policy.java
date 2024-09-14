public class Policy {
    private int policyNumber, age, heightInches;
    private double weightPounds;
    // note: smokingStatus would probably be best as an enum?
    private String providerName, firstName, lastName, smokingStatus;

    Policy() {
        policyNumber = 0;
        age = 0;
        heightInches = 0;
        weightPounds = 0.0;
        providerName = "";
        firstName = "";
        lastName = "";
        smokingStatus = "non-smoker";
    }

    Policy(
        int policyNumber, 
        int age, 
        int heightInches,
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
    public void setPolicyNumber (int policyNumber) { this.policyNumber = policyNumber; }
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setAge(int age) { this.age = age; }
    public int getAge() { 
        return age;
    }

    public void setHeightInches(int height) { this.heightInches = height; }
    public int getHeightInches() {
        return heightInches;
    }

    public void setWeightPounds(double weight) { this.weightPounds = weight; }
    public double getWeightPounds() {
        return weightPounds;
    }

    public void setProviderName(String providerName) { this.providerName = providerName; }
    public String getProviderName() {
        return providerName;
    }

    public void setFirstName(String firstName) { this.firstName = firstName; }
    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) { this.lastName = lastName; }
    public String getLastName() {
        return lastName;
    }

    public void setSmokingStatus(String smokingStatus) { this.smokingStatus = smokingStatus; }
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /* Class Methods */
    public double calculatePolicyHolderBMI() {
        return 0.0;
    }

    public double calculatePolicyCost() {
        return 0.0;
    }
}