package home.week1;

import java.util.Scanner;

/*
 Вводим два числа, если одно из них делиться на другое без остатка, то выводим тру и показываем
 результат деления целую часть от деления  и остачу) в другом случае выводим false и
 показываем результат деления (целую часть от деления  и остачу)
 */

public class _4_7_DivTrueFalse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your whole figures :");
            System.out.println("first :");
            int one = scanner.nextInt();
            System.out.println("second :");
            int two = scanner.nextInt();

            int result = one / two;
            int result1 = one % two;
            boolean result1B = (result1 == 0);

            if (result1B) {
                System.out.println(result1B + ", result: " + result + "," + result1 + " (whole:" + result + ", remain:" + result1 + ")" + "\n");
            } else {
                System.out.println(result1B + ", result: " + result + "," + result1 + " (whole:" + result + ", remain:" + result1 + ")"+ "\n");
            }
        }
    }
}
