import java.util.Scanner;

public class Lab4Q7 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Mortgage loan amortization table (equal total payment plan)

        System.out.print("Enter principal amount: ");
        double principal = input.nextDouble();

        System.out.print("Enter interest in %: ");
        double rate = input.nextDouble();

        System.out.print("Enter total number of month(s): ");
        int months = input.nextInt();

        double r = rate / (12 * 100); // monthly interest rate

        // M = (P * r) / (1 - (1 + r)^-N)
        double payment = (principal * r) / (1 - Math.pow(1 + r, -months));

        double totalInterest = 0;

        System.out.printf("%-8s%15s%15s%15s%15s%15s%n",
                "Month", "Monthly Payment", "Principal", "Interest",
                "Unpaid Balance", "Total Interest");

        for (int n = 1; n <= months; n++) {

            // Cn = M * (1 + r)^-(1 + N - n)  -> principal portion
            double c = payment * Math.pow(1 + r, -(1 + months - n));

            // Ln = M - Cn  -> interest portion
            double l = payment - c;

            // Rn = Ln / r - Cn  -> remaining balance
            double balance = l / r - c;

            if (Math.abs(balance) < 0.005) {
                balance = 0;
            }

            totalInterest += l;

            System.out.printf("%-8d%15.2f%15.2f%15.2f%15.2f%15.2f%n",
                    n, payment, c, l, balance, totalInterest);
        }

        input.close();
    }
}
