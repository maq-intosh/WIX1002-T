public class Lab4Q8 {

    public static void main(String[] args) {

        // Generate the first n prime numbers
        // n is a random integer from 0 to 100

        int n = (int) (Math.random() * 101);

        System.out.println("n = " + n);

        int count = 0;
        int candidate = 2;

        while (count < n) {

            boolean isPrime = true;

            for (int i = 2; i * i <= candidate; i++) {
                if (candidate % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(candidate + " ");
                count++;
            }

            candidate++;
        }

        System.out.println();
    }
}
