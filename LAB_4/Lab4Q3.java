import java.util.Scanner;

public class Lab4Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Minimum, maximum, average and standard deviation of scores
        // Quit when a negative score is entered

        int count = 0;
        int min = 0;
        int max = 0;
        double sum = 0;
        double sumSquare = 0;

        System.out.print("Enter a score [negative score to quit]:");
        int score = input.nextInt();

        while (score >= 0) {

            if (count == 0) {
                min = score;
                max = score;
            } else {
                if (score < min) {
                    min = score;
                }
                if (score > max) {
                    max = score;
                }
            }

            sum += score;
            sumSquare += score * score;
            count++;

            System.out.print("Enter a score [negative score to quit]:");
            score = input.nextInt();
        }

        if (count < 2) {
            System.out.println("Need at least 2 scores");
        } else {
            // s = sqrt( (sum(X^2) - (sum(X))^2 / N) / (N - 1) )
            double inside = (sumSquare - (sum * sum) / count) / (count - 1);

            System.out.println(inside);
            System.out.println("Minimum Score: " + min);
            System.out.println("Maximum Score: " + max);
            System.out.printf("Average Score: %.2f%n", sum / count);
            System.out.printf("Standard Deviation: %.2f%n", Math.sqrt(inside));
        }

        input.close();
    }
}
