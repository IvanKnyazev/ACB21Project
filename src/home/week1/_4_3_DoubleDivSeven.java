package home.week1;

import java.util.Scanner;

/*
 * Пользователь вводит число. Вывести на экран его удвоенное значение, если число делится на 7 нацело
 */

public class _4_3_DoubleDivSeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Please, enter figure: ");
            int Digit = scanner.nextInt();

            if ((Digit % 7) == 0) {
                System.out.println("Double Figure :" + Digit * 2 + "\n");
            } else {
                System.out.println();
            }
        }
    }
}
