import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class PolicyDemo {
    public static void main(String[] args) {
        int policyNumber = 0, age = 0, totalSmokers = 0, totalNonSmokers = 0, policyCount = 0;
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

                InsurancePolicy insurancePolicy = new InsurancePolicy(
                    policyNumber,
                    age,
                    height,
                    weight,
                    providerName,
                    firstName,
                    lastName,
                    smokingStatus
                );

                PolicyHolder policyHolder = new PolicyHolder(insurancePolicy);

                System.out.println(policyHolder);

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    totalSmokers++;
                } else {
                    totalNonSmokers++;
                }

                PolicyHolder.policyHolderCount++;
            }

            System.out.printf("There were %d Policy object(s) created.\n", PolicyHolder.policyHolderCount);
            System.out.printf("The number of policies with a smoker is: %d\n", totalSmokers);
            System.out.printf("The number of policies with a non-smoker is: %d\n", totalNonSmokers);
 
            policyReader.close();
        } catch (FileNotFoundException e) {
            System.out.printf("Error: %s\n", e);
        }
    }
}