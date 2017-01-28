package home.week1;

/*
 Написать программу вычисления идеального веса пользователя (рост-
 100). Выдать рекомендации о необходимости поправиться либо поху-
 деть.
 */

import java.util.Scanner;

public class Ad9_IdealWeight {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your options: ");

        System.out.print("height: ");
        double height = scanner.nextDouble();

        System.out.print("weight: ");
        double weight = scanner.nextDouble();

        double idealWeight = (height - 100);
        boolean idWeb = idealWeight >= weight;
        boolean eqWeb = idealWeight == weight;
        double addWeight = idealWeight - weight;
        double losWeight = weight - idealWeight;

        if (eqWeb){
            System.out.println("You have an ideal weight!!!");
        } else if(!idWeb){
            System.out.println("We recommend you to lose weight - " + losWeight + "!!!");
        } else
            System.out.println("We recommend that you put on weight at + " + addWeight + "!!!");
    }
}
