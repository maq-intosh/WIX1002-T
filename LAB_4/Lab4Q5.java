public class Lab4Q5 {

    public static void main(String[] args) {

        // Two players dice game
        // First player to score more than 100 wins
        // Rolling a 6 gives 6 points and another roll

        int score1 = 0;
        int score2 = 0;
        int player = 1;

        while (score1 <= 100 && score2 <= 100) {

            int roll;

            do {
                roll = (int) (Math.random() * 6) + 1;
                System.out.println("Player " + player + " rolled " + roll);

                if (player == 1) {
                    score1 += roll;
                } else {
                    score2 += roll;
                }

            } while (roll == 6 && score1 <= 100 && score2 <= 100);

            System.out.println("Score -> Player 1: " + score1 + ", Player 2: " + score2);
            System.out.println();

            // Switch turn
            if (player == 1) {
                player = 2;
            } else {
                player = 1;
            }
        }

        if (score1 > 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins!");
        }
    }
}
