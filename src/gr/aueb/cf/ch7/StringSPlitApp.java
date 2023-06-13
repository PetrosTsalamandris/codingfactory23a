package gr.aueb.cf.ch7;

/**
 * Splits a string
 */
public class StringSPlitApp {

    public static void main(String[] args) {
        String s = "Athens     uni of Econs and Bus";

        String[] tokens = s.split(" +");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
