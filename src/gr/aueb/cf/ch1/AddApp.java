package gr.aueb.cf.ch1;

/**
 * Adds two integers.
 * @author Petros pc
 */
public class AddApp {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 7;
        int result = 0;

        result = num1 + num2;

        System.out.println("the result of: " + num1 + ", " + num2 + " is =" + result);
        System.out.printf("the result of %d , %d is %d" , num1, num2, result);
    }

    /**
     * Adds two ints
     * @param a     the first int
     * @param b     the second int
     * @return      the sum of a, b
     *
     */
    public static int add(int a, int b) {

        return a + b;
    }
}
