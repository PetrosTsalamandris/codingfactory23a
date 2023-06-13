package gr.aueb.cf.ch1;

import java.util.Scanner;

public class ArgsApp {

    public static class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int choice;
            do {
                printMenu();
                choice = getChoice(scanner);

                try {
                    printChoice(choice);
                } catch (IllegalArgumentException e) {
                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ εισάγετε έναν αριθμό από 1 έως 5.");
                }

            } while (choice != 5);

            scanner.close();
        }

        public static void printMenu() {
            System.out.println("Επιλέξτε μία επιλογή:");
            System.out.println("1. Επιλογή 1");
            System.out.println("2. Επιλογή 2");
            System.out.println("3. Επιλογή 3");
            System.out.println("4. Επιλογή 4");
            System.out.println("5. Έξοδος");
        }

        public static int getChoice(Scanner scanner) {
            int choice;
            while (true) {
                System.out.print("Εισάγετε την επιλογή σας: ");
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Μη έγκυρη επιλογή. Παρακαλώ εισάγετε έναν αριθμό.");
                    scanner.nextLine(); // Απορρόφηση του ανεπιθύμητου αλφαριθμητικού
                }
            }
            return choice;
        }

        public static void printChoice(int choice) {
            if (choice >= 1 && choice <= 5) {
                System.out.println("Επιλέξατε την επιλογή: " + choice);
            } else {
                throw new IllegalArgumentException("Μη έγκυρη επιλογή.");
            }
        }
    }

}
