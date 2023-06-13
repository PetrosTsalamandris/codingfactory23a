package gr.aueb.cf.ch3;

/**
 * Υπολογιζει το αθροισμα και
 * το γινομενο των 10 πρωτων
 * ακεραιων.
 */
public class SumAndMul10 {

    public static void main(String[] args) {
        int sum = 0;
        int mul = 1;
        int i = 1;

        while (i <= 10) {
            sum += i;
            mul *= i;
            i++;
        }

        System.out.println("Sum:" + sum);
        System.out.println("Mul:" + sum);

    }
}
