package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * Demonstrates BingInteger class
 * Μεγαλους ακεραιους
 */
public class AddBigINtApp {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("21474836474323423432");
        BigInteger bigNum2 = new BigInteger("21474836473434343");
        BigInteger result = new BigInteger("0");

        result = bigNum.add(bigNum2);

        System.out.printf("%,d",result);
    }
}
