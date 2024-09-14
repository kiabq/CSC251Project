public class Policy {
    private int policyNumber, age;
    private double heightInches, weightPounds;
    // note: smokingStatus would probably be best as an enum?
    private String providerName, firstName, lastName, smokingStatus;

    Policy() {
        policyNumber = 0;
        age = 0;
        heightInches = 0.0;
        weightPounds = 0.0;
        providerName = "";
        firstName = "";
        lastName = "";
        smokingStatus = "non-smoker";
    }

    Policy(
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
    public void setPolicyNumber (int policyNumber) { this.policyNumber = policyNumber; }
    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setAge(int age) { this.age = age; }
    public int getAge() { 
        return age;
    }

    public void setHeightInches(double height) { this.heightInches = height; }
    public double getHeightInches() {
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
        return (weightPounds * 703) / (heightInches * heightInches);
    }

    public double calculatePolicyCost() {
        int baseFee = 600;
        double bmi = calculatePolicyHolderBMI();

        if (age > 50) {
            baseFee += 75;
        }

        if (smokingStatus != "non-smoker") {
            baseFee += 100;
        }

        if (bmi > 35) {
            baseFee += (bmi - 35) * 20;
        }

        return baseFee;
    }
}