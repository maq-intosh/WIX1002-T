import java.util.Scanner;

public class Lab4Q2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Sum the series: 1 + (1+2) + (1+2+3) + ... + (1+2+3+...+n)

        System.out.print("Enter n: ");
        int n = input.nextInt();

        int inner = 0; // 1+2+...+i
        int total = 0; // whole series

        for (int i = 1; i <= n; i++) {
            inner += i;
            total += inner;
        }

        System.out.println("Sum of the series = " + total);

        input.close();
    }
}
