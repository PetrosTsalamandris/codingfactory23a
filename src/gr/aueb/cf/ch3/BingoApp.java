package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * κανει bingo Οταν ο χρηστης
 * μαντεψει σωστα ενα secret key
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true) {
            System.out.println("Please insert a secret");
            num = in.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo");
                break;
            } else {
                System.out.println("try again");
            }
        }

    }
}
