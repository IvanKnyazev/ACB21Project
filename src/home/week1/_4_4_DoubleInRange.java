package home.week1;

import java.util.Scanner;

/*
 * Вводим число с плавающей точкой с консоли, и проверяем лежит ли оно в диапазоне от 0 до 1
 */

public class _4_4_DoubleInRange {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            System.out.println("Enter your figure: ");
            double digRang = scanner.nextDouble();

            if ((digRang >= 0 && digRang <= 1)){
                System.out.println("\"Your figure IS IN the range [0 - 1]\"\n");
            } else {
                System.out.println("\"Your figure IS NOT within the range[0 - 1]\"\n");
            }
        }
    }
}
