import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HighestLowestBR {
    public static void main(String[] args) throws Exception {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));

        int Highest = Integer.MIN_VALUE;
        int Lowest = Integer.MAX_VALUE;

        for ( int i = 1; i <= 10; i++ ) {
            System.out.print("Enter number " + i + ": ");
            int number = Integer.parseInt(dataIn.readLine());

            if (number > Highest) {
                Highest = number;
            }

            if (number < Lowest) {
                Lowest = number;
            }
        }

        System.out.print("Highest: " + Highest +
                "\nLowest: " + Lowest);

    }
}