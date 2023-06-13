package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * λαμβανει 3 τιμες απο τον χρηστη,τις
 * a,b,c
 * οπου a ειναι η υποτεινουσα και
 * b, c οι 2 πλευρες.
 * ελεγχει αν το τριγωνο ειναι ορθογωνιο
 * δλδ α^2 == β^2 + c^2
 * εστω EPSILON = 0.000005
 */
public class RightTriangleApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = 0.0;
        double b = 0.0;
        double c = 0.0;
        final double EPSILON = 0.000005;
        boolean isRight = false;

        System.out.println("Insert a,b,c");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();

        isRight = (Math.abs(a*a - b*b - c*c) <= EPSILON);
            System.out.printf("Triangle is right: %b", isRight);
    }
}
