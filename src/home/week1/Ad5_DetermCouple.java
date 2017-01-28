package home.week1;

/*
 Даны три числа a, b, c. Определить, имеется ли среди них хотя бы одна
 пара равных
 */

import java.util.Scanner;

public class Ad5_DetermCouple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three figures ");

        System.out.print("a: ");
        int a = scanner.nextInt();
        System.out.print("b: ");
        int b = scanner.nextInt();
        System.out.print("c: ");
        int c = scanner.nextInt();

        if (a == b && a != c) {
            System.out.println("a is equal to b");
        } else if (a == c && a != b) {
            System.out.println("a is equal to c");
        } else if (b == c && b != a) {
            System.out.println("b is equal to c");
        } else if (a == b || a == c){
            System.out.println("they are all equal");
        } else {
            System.out.println("they are not equal");
        }
    }
}
