package home.week1;

import java.util.Scanner;

/*
Пользователь вводит три числа с консоли, нужно вывести на консоль наибольшее, наименьшее
 */
public class _4_2_ThreeFigures {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Please, enter three figures: ");

            System.out.println("Figure 1: ");
            int figure1 = scanner.nextInt();
            System.out.println("Figure 2: ");
            int figure2 = scanner.nextInt();
            System.out.println("Figure 3: ");
            int figure3 = scanner.nextInt();

            if ((figure1 > figure2) && (figure1 > figure3)) {
                System.out.println("\nMax figure: " + figure1);
            } else if ((figure1 >= figure2) && (figure1 > figure3)) {
                System.out.println("\nMax figure: " + figure1);
            } else if ((figure2 > figure1) && (figure2 > figure3)) {
                System.out.println("\nMax figure: " + figure2);
            } else {
                System.out.println("\nMax figure: " + figure3);
            }

            if ((figure1 < figure2) && (figure1 < figure3)) {
                System.out.println("Min figure: " + figure1 + "\n");
            } else if ((figure1 < figure2) && (figure1 <= figure3)) {
                System.out.println("Min figure: " + figure1 + "\n");
            } else if ((figure2 < figure1) && (figure2 < figure3)) {
                System.out.println("Min figure: " + figure2 + "\n");
            } else if ((figure2 <= figure1) && (figure2 < figure3)) {
                System.out.println("Min figure: " + figure2 + "\n");
            } else {
                System.out.println("Min figure: " + figure3 + "\n");
            }
        }
    }
}