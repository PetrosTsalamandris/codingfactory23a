package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * ενας μικρο βατραχοσ θελει να περασει ενα ποταμι.
 * ο φρογκ βρισκεται στη θεση χ και θελει να φτασει
 * στη θεση Υ (ή σε θεση > Υ).Ο frog jumps a fixed
 * distance D.
 * βρισκει το ελαχιστο αριθμο jumps που κανει ο frog
 * πρεπει να κανει ωστε να φτασει στο στοχο του η να
 * τον ξεπερασει. π.χ. ανεχουμε:
 * x= 1
 * Υ = 82
 * D = 30
 * then frog needs 3 jumps,ηιατι ξεκιναει απο
 * starts at 10, after first jump goes στη θεση 10+30(jump)=40
 * στο 2ο jump 40+30=70
 * και στο 3ο jump παει 70+30=100
 */
public class FrogApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = 10;
        int y = 85;
        int d;
        int jumps = 0;

        System.out.println("please give x,y,d");
        x = in.nextInt();
        y = in.nextInt();
        d = in.nextInt();
        for (int i = x; i < y; i = i + d) {
            jumps++;
        }
        System.out.println("jumps" + jumps);
    }
}
