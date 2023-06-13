package gr.aueb.cf.ch3;

import java.util.Scanner;

/**ενα αεροσκαφος εχει δυο δεξαμενες.
 * Αν μια δεξαμενη εχει λιγοτερα απο
 * 1/4 καυσιμα τοτε αναβει πορτοκαλι σημα,
 * ενω αν κ οι δυο δεξαμενες εχουν
 * < 1/4 τοτε αναβει κοκκινο σημα.
 * Ο πιλοτος (χρηστης) δινει true ή false
 * αναλογα αν η δεξαμενη <1/4 ή οχι, αντιστοιχα.
 */
public class OrangeRedSignalApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isTank1LTQuarter = false;
        boolean isTank2LTQuareter = false;
        boolean orangeOn = false;
        boolean redOn = false;

        System.out.println("Please insert if Tank1, Tank2 are less than 1/4");
        isTank1LTQuarter = in.nextBoolean();
        isTank2LTQuareter = in.nextBoolean();

        orangeOn = isTank1LTQuarter || isTank2LTQuareter;
        redOn = isTank1LTQuarter && isTank2LTQuareter;

        System.out.println("Orange on:" + orangeOn);
        System.out.println("red on on:" + redOn);
    }
}
