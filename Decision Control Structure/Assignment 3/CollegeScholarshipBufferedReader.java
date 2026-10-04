import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CollegeScholarshipBufferedReader {
    public static void main(String[] args) {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
        System.out.println("College Scholarship Application");
        System.out.print("Enter Parents' Salary: ");
        double parentsSalary = Double.parseDouble(dataIn.readLine());

        System.out.print("Enter NSAT Score: ");
        int nsatScore = Integer.parseInt(dataIn.readLine());

        System.out.print("Enter Entrance Exam Score: ");
        int entranceExamScore = Integer.parseInt(dataIn.readLine());

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