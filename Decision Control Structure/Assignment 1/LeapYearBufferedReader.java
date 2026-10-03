import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYearBufferedReader {
    public static void main(String[] args) {

        // Enter Year Line
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a year: ");
            String yearInput = dataIn.readLine();
            int year = Integer.parseInt(yearInput);

            if (year % 4 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        // If entered data is a string or decimal
            } catch (Exception e) {
                System.err.println("Please only enter an Interger.");
        }
    }
}