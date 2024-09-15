import java.util.Scanner;

public class PolicyDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int policyNumber, age;
        double height, weight;
        String providerName, firstName, lastName, smokingStatus;

        System.out.print("Please enter the Policy Number: ");
        policyNumber = input.nextInt();
        input.nextLine();
        
        System.out.print("Please enter the Provider Name: ");
        providerName = input.nextLine();

        System.out.print("Please enter the Policyholder's First Name: ");
        firstName = input.nextLine();

        System.out.print("Please enter the Policyholder's Last Name: ");
        lastName = input.nextLine();

        System.out.print("Please enter the Policyholder's Age: ");
        age = input.nextInt();
        input.nextLine();

        do {
            System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
            smokingStatus = input.nextLine();
        } while (!smokingStatus.equals("smoker") && !smokingStatus.equals("non-smoker"));

        System.out.print("Please enter the Policyholder's Height (in inches): ");
        height = input.nextDouble();

        System.out.print("Please enter the Policyholder's Weight (in pounds): ");
        weight = input.nextDouble();

        input.close();

        InsurancePolicy Insurance = new InsurancePolicy(
            policyNumber,
            age,
            height,
            weight,
            providerName,
            firstName,
            lastName,
            smokingStatus
        );

        System.out.printf("Policy Number: %d\n", Insurance.getPolicyNumber());
        System.out.printf("Provider Name: %s\n", Insurance.getProviderName());
        System.out.printf("Policyholder's First Name: %s\n", Insurance.getFirstName());
        System.out.printf("Policyholder's Last Name: %s\n", Insurance.getLastName());
        System.out.printf("Policyholder's Age: %d\n", Insurance.getAge());
        System.out.printf("Policyholder's Smoking Status: %s\n", Insurance.getSmokingStatus());
        System.out.printf("Policyholder's Height: %.1f\n", Insurance.getHeightInches());
        System.out.printf("Policyholder's Weight: %.1f\n", Insurance.getWeightPounds());
        System.out.printf("Policyholder's BMI: %.2f\n", Insurance.calculatePolicyHolderBMI());
        System.out.printf("Policy Price: $%.2f\n", Insurance.calculatePolicyCost());
    }
}