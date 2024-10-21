import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PolicyDemo {
    public static void main(String[] args) {
        int policyNumber = 0, age = 0, totalSmokers = 0, totalNonSmokers = 0;
        double height = 0, weight = 0;
        String providerName = "", firstName = "", lastName = "", smokingStatus = "";

        try {
            File policies = new File("Policy_Information.txt");
            Scanner policyReader = new Scanner(policies);
            while (policyReader.hasNextLine()) {
                policyNumber = policyReader.nextInt();
                policyReader.nextLine(); // Move to next line
                providerName = policyReader.nextLine();
                firstName = policyReader.nextLine();
                lastName = policyReader.nextLine();
                age = policyReader.nextInt();
                policyReader.nextLine(); // Move to next line
                smokingStatus = policyReader.nextLine();
                height = policyReader.nextDouble();
                weight = policyReader.nextDouble();
                if (policyReader.hasNextLine()) policyReader.nextLine(); 

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
            
                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    totalSmokers++;
                } else {
                    totalNonSmokers++;
                }
            }

            System.out.printf("The number of policies with a smoker is: %d\n", totalSmokers);
            System.out.printf("The number of policies with a non-smoker is: %d\n", totalNonSmokers);
 
            policyReader.close();
        } catch (FileNotFoundException e) {
            System.out.printf("Error: %s\n", e);
        }
    }
}