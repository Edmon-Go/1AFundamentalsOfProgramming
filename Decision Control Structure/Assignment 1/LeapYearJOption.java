import javax.swing.*;

public class LeapYearJOption {
    public static void main(String[] args) {

        try {
        // Enter Year Line
        String yearInput;
        String yearInputMSG = "Enter a year:";
        yearInput = JOptionPane.showInputDialog(
        null,
        yearInputMSG,
        "Leap Year Calculator",
        JOptionPane.QUESTION_MESSAGE);

        int year = Integer.parseInt(yearInput);
        String LeapYearTrue = (year + " is a leap year.");
        String LeapYearFalse = (year + " is not a leap year.");
        if (year % 4 == 0) {
            JOptionPane.showMessageDialog(
                    null,
                    LeapYearTrue,
                    "Leap Year Calculator",
                    JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(
                    null,
                    LeapYearFalse,
                    "Leap Year Calculator",
                    JOptionPane.INFORMATION_MESSAGE);}
        // If entered data is a string or decimal
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
            null,
            "Please only enter an Interger.",
            "Invalid Input",
            JOptionPane.ERROR_MESSAGE
            );
        }
    }
}