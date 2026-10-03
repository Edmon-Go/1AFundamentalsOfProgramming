import javax.swing.*;

public class JKMA_JOption {
    public static void main(String[] args) {

        try {
            String heightInput = JOptionPane.showInputDialog(
            null,
            "Enter applicant's height",
            "Jedi Knight Military Army Application",
            JOptionPane.QUESTION_MESSAGE
            );
            double height = Double.parseDouble(heightInput);

            String ageInput = JOptionPane.showInputDialog(
            null,
            "Enter applicant's age",
            "Jedi Knight Military Army Application",
            JOptionPane.QUESTION_MESSAGE
            );
            double age = Double.parseDouble(ageInput);

            String citizenStatus = JOptionPane.showInputDialog(
            null,
            "Applicant is a citenzen of the Planet Endor\n(C): Citizen | (N): Non-Citizen",
            "Jedi Knight Military Army Application",
            JOptionPane.QUESTION_MESSAGE
            );

            String recommendeeStatus = JOptionPane.showInputDialog(
            null,
            "Applicant is a recommendee of Jedi Master Obi Wan?\n(R): Recommendee | (N): Non-Recommendee",
            "Jedi Knight Military Army Application",
            JOptionPane.QUESTION_MESSAGE
            );

            if (recommendeeStatus.equalsIgnoreCase("R")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Applicant is ACCEPTED.",
                        "Jedi Knight Military Army Application",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else if (height >= 200 && age >= 21 && citizenStatus.equalsIgnoreCase("C")) {
                JOptionPane.showMessageDialog(
                        null,
                        "Applicant is ACCEPTED.",
                        "Jedi Knight Military Army Application",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Applicant is REJECTED.",
                        "Jedi Knight Military Army Application",
                        JOptionPane.INFORMATION_MESSAGE
                );}
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Invalid Data Input!",
                    "Jedi Knight Military Army Application",
                    JOptionPane.ERROR_MESSAGE
            );
        }
    }
}