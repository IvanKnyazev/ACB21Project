package home.week1;

/*
 У вас есть скорость и растояние, за какое время вы приедете в пукт назначания
 */

import java.util.Scanner;

public class Ad6_DetermTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter next values ");

        System.out.print("speed: ");
        double a = scanner.nextInt();
        System.out.print("distance: ");
        double b = scanner.nextInt();

        double c = (b / a) * 60;

        if (a == 0 && b == 0){
            System.out.println("Enter values yet");
        } else if (a > 0 && b > 0){
            System.out.println("FOR " + (int)c + " minutes you arrive at your destination");
        }
    }
}

