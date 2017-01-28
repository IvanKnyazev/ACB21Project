package home.week1;

/*
 Вычислить стоимость покупки с учетом скидки. Скидка в 10% предос-
 тавляется, если сумма покупки превышает 1000 гривен.
 */

import java.util.Scanner;

public class Ad8_CostWithDiscount {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your cost of goods: ");
        double cost = scanner.nextDouble();

        double discount1 = 10;
        double discount2 = cost / discount1;
        double costDisc = cost - discount2;

        String mass = "--------------------------------------------\nValue of goods without discount is " + "\' " + cost + " \'";
        String massDisc = "Discount (" + discount1 + "%) is: " + "\' " + discount2+ " \'" + "\n--------------------------------------------\nValue of goods with discount is " + "\' " + costDisc + " \'";

        if (cost <= 0) {
            System.out.println("Buy something :)");
        } else if (cost <= 1000) {
            System.out.println(mass);
        } else {
            System.out.println(massDisc);
        }
    }
}
