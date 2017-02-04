package home.week2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Найдите наибольший элемент массива.
 */
public class _5Task {
    public static void main(String[] args) {

        System.out.println("Enter arrays size");
        Scanner in = new Scanner(System.in);
        try {
            int[] array = new int[in.nextInt()];

            System.out.println("Enter arrays numbers");
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            Arrays.sort(array);
            int size = array.length;
            System.out.println("Max element: " + array[size - 1]);
        }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
