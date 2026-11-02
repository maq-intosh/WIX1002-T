import java.util.Scanner;

public class Lab4Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display all factors of an integer in increasing order

        System.out.print("Enter an Integer: ");
        int number = input.nextInt();

        System.out.print("The factors are: ");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (i != 1) {
                    System.out.print(", ");
                }
                System.out.print(i);
            }
        }

        System.out.println();

        input.close();
    }
}
