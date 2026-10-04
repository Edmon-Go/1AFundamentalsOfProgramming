import java.util.Scanner;

public class CollegeScholarshipScanner {
    public static void main(String[] args) {

        Scanner dataIn = new Scanner(System.in);
        try {
            System.out.println("College Scholarship Application");
            System.out.print("Enter Parents' Salary: ");
            double parentsSalary = Double.parseDouble(dataIn.nextLine());

            System.out.print("Enter NSAT Score: ");
            int nsatScore = Integer.parseInt(dataIn.nextLine());

            System.out.print("Enter Entrance Exam Score: ");
            int entranceExamScore = Integer.parseInt(dataIn.nextLine());

            double averageScore = ( nsatScore + entranceExamScore ) / 2.0;
            System.out.println("Average Score: " + averageScore);
            if (parentsSalary > 10000 || nsatScore < 90 || entranceExamScore < 85) {
                System.out.println("Your application for College Scholarship is REJECTED.");
            } else if (parentsSalary <= 3500 && 91 <= averageScore) {
                System.out.println("Your application for College Scholarship is ACCEPTED.");
            } else {
                System.out.println("Your application for College Scholarship is currently in Further Study.");
            }
        } catch (Exception e) {
            System.err.println("Please enter valid numbers.");
        }
    }
}