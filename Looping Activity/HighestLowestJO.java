import javax.swing.*;

public class HighestLowestJO {
    public static void main(String[] args) throws Exception {

        int Highest = Integer.MIN_VALUE;
        int Lowest = Integer.MAX_VALUE;

        for ( int i = 1; i <= 10; i++ ) {
            int number = Integer.parseInt(JOptionPane.showInputDialog(
                    null,
                    "Enter number " + i + ": ",
                    "Sort",
                    JOptionPane.QUESTION_MESSAGE));

            if (number > Highest) {
                Highest = number;
            }

            if (number < Lowest) {
                Lowest = number;
            }
        }

        JOptionPane.showInputDialog(
                null,
                "Highest: " + Highest +
                        "\nLowest: " + Lowest,
                "Sort",
                JOptionPane.QUESTION_MESSAGE);

    }
}