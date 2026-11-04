import javax.swing.JOptionPane;

public class MuchoDineroJO {
    public static void main(String[] args) {
        double balance = 20000, amount;

        do {
            amount = Double.parseDouble(
                    JOptionPane.showInputDialog("Enter amount (0 to stop):"));

            if (amount > 0)
                balance += amount;
            else if (amount < 0) {
                if (balance + amount >= 0)
                    balance += amount;
                else
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
            }

            if (amount != 0)
                JOptionPane.showMessageDialog(null, "Balance: P" + balance);

        } while (amount != 0);

        JOptionPane.showMessageDialog(null, "Transaction completed!");
    }
}