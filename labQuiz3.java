import javax.swing.*;

class labQuiz3 {
    public static void main(String[] args) {

        // Username Input Panel
        String nameInputMessage = "Please enter the worker's name.";
        String nameInput = JOptionPane.showInputDialog(
            null,
            nameInputMessage,
            "Username",
            JOptionPane.QUESTION_MESSAGE );

        // Old Salary Input
        String salaryMessage = "Enter " + nameInput + "'s Old Salary.";
        double oldSalaryInput = Double.parseDouble(JOptionPane.showInputDialog(
                null,
                salaryMessage,
                "Old Salary of Worker",
                JOptionPane.QUESTION_MESSAGE ));

        // Salary Calculator Display
        double increaseRate = 0.1775;
        double salaryIncrease = oldSalaryInput * increaseRate;
        double newSalary = oldSalaryInput + salaryIncrease;
        double retroactivePay = salaryIncrease * 2;

        // Display Result
        String calculatedSalaryFormatResult =
                "Worker: " + nameInput +
                        "\nOld Salary: ₱" + String.format("%.2f", oldSalaryInput) +
                        "\nNew Salary: ₱" + String.format("%.2f", newSalary) +
                        "\nRetroactive Pay (2 months): ₱" + String.format("%.2f", retroactivePay);

        JOptionPane.showMessageDialog(
                null,
                calculatedSalaryFormatResult,
                "Salary Calculation",
                JOptionPane.INFORMATION_MESSAGE
        );
    }
}