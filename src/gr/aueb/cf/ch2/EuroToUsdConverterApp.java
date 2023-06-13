package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Μετατρεπει euros σε δολαρια ΗΠΑ.
 * λαμβανει απο το χρηστη (stdin) ενα ακεραιο
 * που συμβολιζει το ποσο σε Euros και μετατρεπει
 * σε δολαρια και εμφανιζει το τελικο αποτελεσμα
 */
public class EuroToUsdConverterApp {
    //Δηλωση και αρχικοποιηση
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY = 99;

        // Εντολες
        System.out.println("Please insert an amount (in Euros)");
        inputEuros = scanner.nextInt();

        totalUsaCents = inputEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;

        //Εκτυπωση αποτελεσματων
        System.out.printf("%d Euros = %d USA dollars, %d USA cents", inputEuros, usaDollars, usaCents);
    }
}
