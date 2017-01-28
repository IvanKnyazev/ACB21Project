package home.week1;

/*
 Ввести с клавиатуры три числа, положительные возвести в куб, а отрица-
 тельные заменить на 0.
 */

import java.util.Scanner;

public class Ad2_ThreeFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter figures ");

        System.out.print("the first: ");
        double a = scanner.nextDouble();
        System.out.print("the second: ");
        double b = scanner.nextDouble();
        System.out.print("the third: ");
        double c = scanner.nextDouble();
        System.out.println();

        int d = 3;

        double resultA = Math.pow(a, d);
        double resultB = Math.pow(b, d);
        double resultC = Math.pow(c, d);


        if (a > 0) {
            System.out.println("first number cubed: " + (int)resultA);
        } else {
            System.out.println("first number is 0");
        }

        if (b > 0) {
            System.out.println("second number cubed: " + (int)resultB);
        } else {
            System.out.println("second number is 0");
        }

        if (c > 0) {
            System.out.println("third number cubed: " + (int)resultC);
        } else {
            System.out.println("third number is 0");
        }
    }
}
