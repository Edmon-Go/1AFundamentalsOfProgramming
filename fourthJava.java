import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fourthJava {
    public static void main(String[] args) {

        String filePath = "C:\\Users\\Raquel\\OneDrive\\Desktop\\Git\\1AFundamentalsOfProgramming\\output.txt";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("This is an activity in Fundamentals of Programming.");
            writer.newLine();
            writer.write("From Edmon Jr. V. Go");
            writer.newLine();
            writer.write("This is a screenshot of proof that it's working.");
            System.out.println("Data successfully written to the file!");
        } catch (IOException e) {
        System.err.println("An error occurred while writing to the file.");
        e.printStackTrace();
        }
    }
}