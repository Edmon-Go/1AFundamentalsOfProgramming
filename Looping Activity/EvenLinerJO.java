import javax.swing.*;

public class EvenLinerJO {
    public static void main(String[] args) {

        String output = "";

        for (int i = 2; i <= 100; i += 2) {
            output += i + ", ";

            if (i % 20 == 0) {
                output += "\n";
            }
        }

        JOptionPane.showMessageDialog(
        null, output);
    }
}