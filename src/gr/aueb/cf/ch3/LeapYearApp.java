package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * αποφασιζει ενα ετος αν ειναι δισεκτο
 * δλδ το δισεκτο σημαινει το ετος να διαιρειται με το 4,
 * να μην διαιρειται με το 100,κ αν διαιρειται με το 100
 * να διαιρειται κ με το 400
 */
public class LeapYearApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        boolean isLeap = false;

        System.out.println("please provide a year (int)");
        year = in.nextInt();

        isLeap = year % 4 == 0 && (year % 100 !=0 || year % 400 ==0);

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else if (year % 400 == 0) {
                isLeap = true;
            }
        }
        System.out.println("year is δισεκτο:" + isLeap);
    }
}
