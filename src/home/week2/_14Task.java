package home.week2;

import java.util.Scanner;

/**
 * Реализовать метод, который меняет местами слова в строке, состоящей из двух слов
 */
public class _14Task {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("enter expression:");
        String word = in.nextLine();

        String[] word1 = word.split(" ");

        String word2 = String.join(" ",word1[1],word1[0]);
        System.out.println(word2);
    }
}
