package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρηστης δηλωνει βαθμους Φαρεναιτ
 * κ μετατρεπονται σε βαθμους Κελσιου
 */

public class TempApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int farhenait = 0;

        System.out.println("Enter temp in Farhen");
        farhenait = in.nextInt();
        celsius = 5 * (farhenait -32) / 9;

        System.out.print("Temperature in Celsius = " + celsius);
    }
}
