package gr.aueb.cf.ch5;

/**
 * Υπολογιζει το α^n αναδρομικα.
 */
public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    /**
     * Recursive a^n
     * @param a the base
     * @param b the power
     * @return the power of a
     */
    public static float power(float a, float b) {
        if (b < 0) {
            return 1 / power(a, -b);
        }

        if (b == 0) return 1;

        return a * power(a, b-1);

    }
}
