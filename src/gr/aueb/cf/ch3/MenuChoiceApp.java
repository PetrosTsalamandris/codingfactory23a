package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * εμφανιζει ενα μενου,ο χρηστης
 * δινει μια επιλογη κ λαμβανειθ
 * ενα αντιστοιχο feeedback/confirmation
 */
public class MenuChoiceApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("επιλεξτε ενα μενου");
            System.out.println("1.εiσαγωγη");
            System.out.println("2.ενημερωση");
            System.out.println("3.διαγραφη");
            System.out.println("4.αναζητηση");
            System.out.println("5.εξοδος");

            choice = in.nextInt();

            if (choice < 1 || choice > 5) {
                System.out.println("επιλεξατε εξοδο");
            }

            if (choice == 1) {
                System.out.println("επιλεξατε εισαγωγη");
            } else if (choice == 2) {
                System.out.println("επιλεξατε ενημερωση");
            } else if (choice == 3) {
                System.out.println("επιλεξατε διαγραφη");
            } else {
                System.out.println("επιλεξατε αναζητηση");
            }

        } while (choice != 5);
    }
}
