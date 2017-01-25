package home.week1;

import java.util.Scanner;

/*
 Вводим два числа, сравнить последнии цифры этих чисел (пользоваться оператором %)
 124    4    -   true
 1456   567  -   false
 1      2    -   false
 18     98   -   true
 */

public class _4_8_CompareLastFigure {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter your whole figures :");
            System.out.println("first :");
            int one = scanner.nextInt();
            System.out.println("second :");
            int two = scanner.nextInt();
            System.out.print("compare last: ");

            int compare1 = one % two;
            boolean compare1B = compare1 == 0;

            int compare2 = two % one;
            boolean compare2B = compare2 == 0;

            if (one > two) {
                System.out.println(compare1B + "\n");
            } else if (two > one) {
                System.out.println(!compare2B + "\n");
            }
        }
        System.out.println("УСЁ ШЕФ!!!!!");
    }
}