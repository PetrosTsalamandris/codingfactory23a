package gr.aueb.cf.ch2;

/**
 * Overflow
 */

public class AddApp {
    public static void main(String[] args) {
        //Δηλωση και αρχικοποιηση μεταβλητων
        int num1 = 2_147_483_647;
        int num2 = 2;
        int result = 0;

        //Εντολες
        result = num1 + num2;
        System.out.printf("sum: "+ result);



    }
}
