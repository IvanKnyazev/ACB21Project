package home.week1;

import java.util.Scanner;

/*
 Ввести с экрана число от 1 до 12. По номеру месяца выдать сообщение о
 времени года. Если пользователь введет недопустимое число, программа
 должна выдать сообщение об ошибке.
 */
public class Ad7_SelectSeasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter values from 1 - 12 ");

        System.out.print("Month number: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 12:
            case 1:
            case 2:
                System.out.println("is Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("is Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("is Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("is Autumn");
                break;
            default:
                System.out.println("ERROR. Enter values yet");
        }
    }
}
