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

    public void setPolicyNumber () {}
    public int getPolicyNumber() {
        return 0;
    }

    public void setAge() {}
    public int getAge() {
        return 0;
    }

    public void setHeightInches() {}
    public int getHeightInches() {
        return 0;
    }

    public void setWeightPounds() {}
    public double getWeightPounds() {
        return 0.0;
    }

    public void setProvideName() {}
    public String getProviderName() {
        return "";
    }

    public void setFirstName() {}
    public String getFirstName() {
        return "";
    }

    public void setLastName() {}
    public String getLastName() {
        return "";
    }

    public void setSmokingStatus() {}
    public String getSmokingStatus() {
        return "";
    }
}