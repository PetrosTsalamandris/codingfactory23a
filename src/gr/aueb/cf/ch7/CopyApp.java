package gr.aueb.cf.ch7;

/**
 * copies two strings
 */
public class CopyApp {

    public static void main(String[] args) {
        String s = "Coding Factory";
        String clone;

        //reference copy - shallow copy
        clone = s;

        System.out.println (s);
    }
}
