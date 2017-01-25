package home.week1;

import java.util.Scanner;

/*
 Вводим два числа, вывести их суму, если она в диапазоне от 11 до 19
 */

public class _4_6_SumIfRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter whole figure: ");

            System.out.println("figure1: ");
            int first = scanner.nextInt();
            System.out.println("figure2: ");
            int two = scanner.nextInt();

            int result = first + two;
            boolean resultB = (result > 11 && result < 19);

            if (resultB) {
                System.out.println("Result: SUMM: " + result + " - IS IN the range [0 - 1]" + "\n");
            } else {
                System.out.println("Result: SUMM IS NOT within range [11 - 19]" + "\n");
            }
        }
    }
}
