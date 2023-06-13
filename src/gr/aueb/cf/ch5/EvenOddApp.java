package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * αποφασιζει αν ενας αριθμος ειναι
 * αρτιος ή περιτος
 */
public class EvenOddApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        boolean isNumEven = false;

        System.out.println("Please insert an int");
        num = in.nextInt();

        isNumEven = isEven(num);

        System.out.println("Num " + num + " is even: " + isNumEven);

    }

    /**
     * evaluates an int if it is even or not
     * @param n the number (int) to evaluate
     * @return true, if n is even, false otherwise.
     */
    public static boolean isEven (int n) {
        return n % 2 == 0;      //καλυτερα ετσι
//        if (n % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
