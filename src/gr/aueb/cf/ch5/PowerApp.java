package gr.aueb.cf.ch5;

/**
 * Υπολογιζει το a^n.
 */
public class PowerApp {

    public static void main(String[] args) {
        int a = 3;
        int n = 10;

        int result = pow(a , n);

        System.out.println("result: " + result);
    }

    /**
     * returns the power of an int
     *
     * @param a     the base
     * @param n     the power to raise
     * @return      the power of a^n
     */
    public static int pow(int a, int n) {
        int power = 1;
        for (int i = 1; i <= n; i++) {
            power = power * a;
        }
        return power;
    }
}
