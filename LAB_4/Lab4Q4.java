import java.util.Scanner;

public class Lab4Q4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Display the calendar for May and August

        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the first day of the year (0 for Sunday, 6 for Saturday): ");
        int firstDay = input.nextInt();

        boolean leap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        // month 5 = May, month 8 = August
        for (int month = 5; month <= 8; month += 3) {

            // Count the days before this month starts
            int daysBefore = 0;

            for (int m = 1; m < month; m++) {
                int days = 31;

                if (m == 4 || m == 6 || m == 9 || m == 11) {
                    days = 30;
                } else if (m == 2) {
                    if (leap) {
                        days = 29;
                    } else {
                        days = 28;
                    }
                }

                daysBefore += days;
            }

            int startDay = (firstDay + daysBefore) % 7;

            // May and August both have 31 days
            int monthDays = 31;

            System.out.println();

            if (month == 5) {
                System.out.println("        May " + year);
            } else {
                System.out.println("       August " + year);
            }

            System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

            // Blank spaces before day 1
            for (int i = 0; i < startDay; i++) {
                System.out.print("    ");
            }

            for (int day = 1; day <= monthDays; day++) {
                System.out.printf("%4d", day);

                if ((startDay + day) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
        }

        input.close();
    }
}
