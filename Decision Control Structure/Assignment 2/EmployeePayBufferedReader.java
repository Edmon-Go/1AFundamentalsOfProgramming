import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EmployeePayBufferedReader {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter hourly pay rate: ");
            double rate = Double.parseDouble(dataIn.readLine());

            System.out.print("Enter hours worked: ");
            double hours = Double.parseDouble(dataIn.readLine());

            double grossPay = rate * hours;

            double withHoldingRate;

            if (grossPay <= 2000) {
                withHoldingRate = 0.10;
            } else if (grossPay <= 4000) {
                withHoldingRate = 0.12;
            } else if (grossPay <= 10000) {
                withHoldingRate = 0.15;
            } else {
                withHoldingRate = 0.20;
            }

            double withHoldingTax = grossPay * withHoldingRate;

            double netPay = grossPay - withHoldingTax;

            System.out.printf("Gross Pay: Php %.2f%n", grossPay);
            System.out.printf("Withholding Tax: Php %.2f%n", withHoldingTax);
            System.out.printf("Net Pay: Php %.2f%n", netPay);
        } catch (Exception e) {
            System.err.println("Invalid Input Data!");
        }
    }
}