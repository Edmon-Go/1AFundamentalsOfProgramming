import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MuchoDineroBR {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double balance = 20000, amount;

        do {
            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(br.readLine());

            if (amount > 0)
                balance += amount;
            else if (amount < 0) {
                if (balance + amount >= 0)
                    balance += amount;
                else
                    System.out.println("INSUFFICIENT FUNDS!");
            }

            if (amount != 0)
                System.out.println("Balance: P" + balance);

        } while (amount != 0);
    }
}