package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ο χρηστης εχει 10 ευκαιριες για να
 * βρει ενα μυστικο κλειδι(Int).
 * αν το βρει νωριτερα απο την 10η προσπαθεια
 * η for θα πρεπει να σταματησει (break)
 */
public class FindTheSecretApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int SECRET_KEY = 12;
        int num;
        boolean found = false;

        for (int i = 1; i <= 10; i++) {
            System.out.println("please make a guess");
            num = in.nextInt();

            if (num == SECRET_KEY) {
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No worries try again");
            System.exit(1);
        }
        System.out.println("Success");
    }
}
