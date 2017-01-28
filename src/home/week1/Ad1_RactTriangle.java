package home.week1;

/*
 Ввести с клавиатуры значения трех сторон треугольника a, b и c и опреде-
 лить, является ли он прямоугольным. Ответ вывести в виде сообщения.
 */

import java.util.Scanner;

public class Ad1_RactTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter triangle values ");

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        int a1 = a * a;
        boolean a1B = (a1 == (b * b + c * c));

        int b1 = b * b;
        boolean b1B = (b1 == (a * a + c * c));

        int c1 = c * c;
        boolean c1B = (c1 == (b * b + a * a));

        if ( a <= 0 || b <= 0 || c <= 0 ) {
            System.out.println("the value of one of the parties can not be be 0 or -");
        } else if ((a1B || b1B || c1B)){
            System.out.println("right triangle");
        } else {
            System.out.println("triangle is not rectangular");
        }
    }
}
