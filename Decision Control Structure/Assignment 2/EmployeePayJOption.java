import javax.swing.*;

class EmployeePayScanner {
    public static void main(String[] args) {

        try {
            String rateInput = JOptionPane.showInputDialog(
            null,
            "Enter hourly pay rate:",
            "Employee Pay Calculator",
            JOptionPane.QUESTION_MESSAGE);

            String hoursInput = JOptionPane.showInputDialog(
            null,
            "Enter hours worked:",
            "Employee Pay Calculator",
            JOptionPane.QUESTION_MESSAGE);

            double rate = Double.parseDouble(rateInput);
            double hours = Double.parseDouble(hoursInput);

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

            String PayResultFormat = "Hourly Pay Rate: Php " + String.format("%.2f", rate) +
                                     "\nHours Worked: " + String.format("%.2f", hours) + " hours" +
                                     "\nGross Pay: Php " + String.format("%.2f", grossPay) +
                                     "\nWithholding Tax: Php " + String.format("%.2f", withHoldingTax) +
                                     "\nNet Pay: Php " + String.format("%.2f", netPay);

            JOptionPane.showMessageDialog(
            null,
            PayResultFormat,
            "Employee Pay Calculator Result",
            JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
            null,
            "Invalid Data Input!",
            "Employee Pay Calculator Result",
            JOptionPane.ERROR_MESSAGE);
        }
    }
}