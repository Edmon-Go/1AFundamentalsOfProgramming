import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JKMA_BufferedReader {
    public static void main(String[] args) throws Exception {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter applicant's height: ");
            double height = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter applicant's age: ");
            int age = Integer.parseInt(dataIn.readLine());

            System.out.print("Applicant is a citenzen of the Planet Endor (C/N)\nC: Citizen\nN: Non-Citizen\nAnswer: ");
            String citizenStatus = dataIn.readLine();

            System.out.print("Applicant is a recommendee of Jedi Master Obi Wan? (R/N)\nAnswer: ");
            String recommendeeStatus = dataIn.readLine();

            if (recommendeeStatus.equalsIgnoreCase("R")) {
                System.out.println("Applicant is ACCEPTED.");
            } else if (height >= 200 && age >= 21 && citizenStatus.equalsIgnoreCase("C")) {
                System.out.println("Applicant is ACCEPTED.");
            } else {
                System.out.println("Applicant is REJECTED.");
            }
        } catch (Exception e) {
            System.err.println("Invalid Data Input!");
        }
    }
}