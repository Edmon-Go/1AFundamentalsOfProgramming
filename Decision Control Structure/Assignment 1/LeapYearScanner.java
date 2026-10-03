import java.util.Scanner;

public class LeapYearScanner {
    public static void main(String[] args) {

        try {
            // Enter Year Line
            Scanner dataIn = new Scanner(System.in);
            System.out.print("Enter a year: ");
            String yearInput = dataIn.nextLine();
            int year = Integer.parseInt(yearInput);

            if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
            // If entered data is a string or decimal
            } catch (Exception e) {
            System.err.println("Please only enter an Integer.");
        }
    }
}