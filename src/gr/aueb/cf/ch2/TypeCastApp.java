package gr.aueb.cf.ch2;

public class TypeCastApp {
    public static void main(String[] args) {
        int num1 = 10;
        long num2 = 20L;
        long result = 0L;


        num1 = (int) num2;

        result = num1 + num2;
        System.out.println("Το αποτελεσμα ειναι" + num1   + num2  + result );
    }
}
