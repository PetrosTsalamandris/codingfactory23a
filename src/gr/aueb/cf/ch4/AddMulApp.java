package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * προσθετει κ πολλαπλασιαζει
 * n πρωτους ακεραιους. Το n
 * θα το δωσει ο χρηστης.
 */
public class AddMulApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum = 0;
        int result = 1;

        System.out.println("Please insert a num (int)");
        n = in.nextInt();

        for (int i = 1; i <=n; i++) {
            sum = sum +1;
            result = result * i;
        }

        System.out.println("sum = " + sum);
        System.out.println("Mul = " + result);
    }
}
