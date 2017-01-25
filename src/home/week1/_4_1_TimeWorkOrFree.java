package home.week1;

/* Пользователь вводит параметр с консоли (текущий час от 0 до 24)
   Если время от 9 до 18, то выводим "Я на работе", в другом случае "Я отдыхаю")
*/

import java.util.Scanner;

public class _4_1_TimeWorkOrFree {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter time");
            int currentTime = scanner.nextInt();

            if (currentTime >= 9 && currentTime <= 18){
                System.out.println("I'm at work" + "\n");
            } else {
                System.out.println("I'm resting" + "\n");
            }
        }
    }
}
