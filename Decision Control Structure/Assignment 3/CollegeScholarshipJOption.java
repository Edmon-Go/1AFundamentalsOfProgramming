import javax.swing.*;

public class CollegeScholarshipJOption {
    public static void main(String[] args) {

        try {
            String parentsSalaryInput = JOptionPane.showInputDialog(
                    null,
                    "Parents' Salary: P*.**" +
                            "\nNSAT Score: *" +
                            "\nEntrance Exam Score: *" +
                            "\n\nEnter Parent's Salary:",
                    "College Scholarship Application",
                    JOptionPane.QUESTION_MESSAGE);
                    double parentsSalary = Double.parseDouble(parentsSalaryInput);

            String nsatScoreInput = JOptionPane.showInputDialog(
                    null,
                    "Parents' Salary: P" + parentsSalaryInput +
                            "\nNSAT Score: *" +
                            "\nEntrance Exam Score: *" +
                            "\n\nEnter NSAT Score:",
                    "College Scholarship Application",
                    JOptionPane.QUESTION_MESSAGE);
                    int nsatScore = Integer.parseInt(nsatScoreInput);

            String entranceExamScoreInput = JOptionPane.showInputDialog(
                    null,
                    "Parents' Salary: " + parentsSalaryInput +
                            "\nNSAT Score: " + nsatScoreInput +
                            "\nEntrance Exam Score: *" +
                            "\n\nEnter Entrance Exam Score:",
                    "College Scholarship Application",
                    JOptionPane.QUESTION_MESSAGE);
                    int entranceExamScore = Integer.parseInt(entranceExamScoreInput);

            JOptionPane.showMessageDialog(
                    null,
                    "Data Overview\n\n" +
                            "Parents' Salary: " + parentsSalaryInput +
                            "\nNSAT Score: " + nsatScoreInput +
                            "\nEntrance Exam Score: " + entranceExamScoreInput,
                    "College Scholarship Application",
                    JOptionPane.INFORMATION_MESSAGE);

            double averageScore = ( nsatScore + entranceExamScore ) / 2.0;
            System.out.println("Average Score: " + averageScore);
            if (parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85) {
                JOptionPane.showMessageDialog(
                        null,
                        "Your application for College Scholarship is REJECTED.",
                        "College Scholarship Application",
                        JOptionPane.ERROR_MESSAGE);
            } else if (parentsSalary <= 3500 && 91 <= averageScore) {
                JOptionPane.showMessageDialog(
                        null,
                        "Your application for College Scholarship is ACCEPTED.",
                        "College Scholarship Application",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(
                        null,
                        "Your application for College Scholarship is currently in Further Study.",
                        "College Scholarship Application",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Please enter valid numbers.",
                    "College Scholarship Application",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}