package gr.aueb.cf.test;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει ένα αριθμό επιλογής
 * απο το μενου, και αναλογα την επιλογη
 * βγαζει το ακολουθο αποτελεσμα.
 *
 */

public class SmallExc {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;

        do {
            printMenu();
            choice = getNextInt("Please insert your choice");
            if (isChoiceInvalid(choice)) {
                System.out.println("Choice is invalid");
                continue;
            }
            if (isChoiceQuit(choice)) {
                break;
            }
            result = isChoiceRight(choice);
            System.out.println("Result = " + result);
        } while (true);


    }

    public static void printMenu() {
        System.out.println("Επιλεξτε ενα απο τα παρακατω");
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1");
        System.out.println("6. Έξοδος από το πρόγραμμα");

    }

    public static int getNextInt(String message) {
        System.out.println(message);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }

    public static boolean isChoiceQuit(int choice) {return choice == 6;}

    public static int isChoiceRight(int choice) {

        int num = 0;
        switch (choice) {
            case 1:
                num = choice1(num);
                break;
            case 2:
                num = choice2(num);
                break;
            case 3:
                num = choice3(num);
                break;
            case 4:
                num = choice4(num);
                break;
            case 5:
                num = choice5(num);
                break;
            case 6:
            default:
                break;
        }
        return num;
    }

    public static int choice1(int n) {

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        return n;

    }

    public static int choice2(int n) {

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        return n;
    }

    public static int choice3(int n) {

        System.out.println("please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    public static int choice4(int n) {

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }

    public static int choice5(int n) {

        System.out.println("Please provide a number of stars");
        n = in.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return n;
    }
}
