package home.week1;

/*
 Известны две скорости, одна в километрах в час, другая в метрах в секун-
 ду. Какая из них больше?
 */

import java.util.Scanner;

public class Ad4_SpeedsMore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter speeds ");

        System.out.print("speed1 in km/h: ");
        int speed1 = scanner.nextInt();
        System.out.print("speed1 in m/s: ");
        int speed2 = scanner.nextInt();

        int speed1Res = speed1;
        int speed2Res = speed2 * 3600 / 1000;

        if (speed1Res > speed2Res) {
            System.out.println("\nspeed in km/h more then speed in m/s");
        } else if (speed1Res < speed2Res) {
            System.out.println("\nspeed in m/s more then speed in km/h");
        } else {
            System.out.println("\nspeeds are equal");
        }
    }
}
