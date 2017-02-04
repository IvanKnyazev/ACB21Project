package home.week2;

import java.util.Scanner;

/**
 * Реализовать метод, который делает реверс строки (StringBuffer не использовать)
 */
public class _15Task {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter expression: ");
        String word = in.nextLine();

        char[] word1 = word.toCharArray();

        System.out.print("expression reverse: ");

        for (int i = word1.length-1; i >= 0 ; i--) {
            System.out.print(word1[i]+ "");
        }
    }
}
