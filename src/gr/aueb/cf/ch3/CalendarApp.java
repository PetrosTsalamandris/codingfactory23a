package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης δηλωνει 3 ακέραιους αριθμούς
 * που αναπαριστούν ημέρα, μήνα, έτος
 */

public class CalendarApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Please enter date");
        day = in.nextInt();
        month = in.nextInt();
        year = in.nextInt();

        System.out.printf("Η ημερομηνια ειναι: %02d/%02d/%02d ",day, month, year % 100 );
    }
}
