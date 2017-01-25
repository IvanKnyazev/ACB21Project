package home.week1;

import java.util.Scanner;

/*
 Вводим 2 числа. Если первое число больше второго, то вывести на экран разницу чисел.
 Если второе больше, то выводим сумму.
 */

public class _4_5_CompareFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Enter your whole figures :");
            System.out.println("first :");
            int one = scanner.nextInt();
            System.out.println("second :");
            int two = scanner.nextInt();

            int more1 = one - two;
            int more2 = two + one;

            boolean more1B = (one > two);
            boolean more2B = (two > one);
            boolean more3B = (two == one);

            if (more1B) {
                System.out.println("difference: " + more1 + "\n");
            } else if (more2B){
                System.out.println("cumulative: " + more2 + "\n");
            } else if (more3B){
                System.out.println("equality, please, repeat yet" + "\n");
            }
        }
    }
}
