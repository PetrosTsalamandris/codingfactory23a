package gr.aueb.cf.ch4;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * υπολογιζει το a^n με BigInteger.
 */
public class BigIntPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger a = new BigInteger("0");
        BigInteger n; //ειναι το ιδιο με το απο πανω γτ ο χρηστης δινει την τιμη
        BigInteger result = new BigInteger("1");

        System.out.println("please insert two ints base,power");
        a = BigInteger.valueOf(in.nextInt());
        n = BigInteger.valueOf(in.nextInt());

        for (int i = 1; i <= n.intValue(); i++) {
            result = result.multiply(a);
        }

        System.out.printf("%d^%d = %,d", a, n, result);
    }
}
