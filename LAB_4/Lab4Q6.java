public class Lab4Q6 {

    public static void main(String[] args) {

        // Generate a non-negative random integer
        // and display the number of digits

        int number = (int) (Math.random() * 1000000000);

        int temp = number;
        int digits = 0;

        if (temp == 0) {
            digits = 1;
        }

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        System.out.println("Random integer: " + number);
        System.out.println("Number of digits: " + digits);
    }
}
