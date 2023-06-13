package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Βρισκει το τετραγωνο και τον κυβο
 * ενος ακεραιου που δινει ο χρηστης
 */
public class MathPowerApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Please inser a num (int)");
        inputNum = in.nextInt();

        System.out.printf("num: %d, square: %d, cube: %d",
                inputNum, (int) Math.pow(inputNum, 2), (int) Math.pow(inputNum, 3));
    }
}
