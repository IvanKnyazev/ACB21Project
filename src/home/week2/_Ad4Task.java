package home.week2;

import java.util.Arrays;

/**
 * Заданы два массива одинаковой длинны с любыми значениями,
 скопировать данные из первого массива во второй
 */
public class _Ad4Task {
    public static void main(String[] args) {
        String[] oneM = {"9", "8", "7", "6", "5", "4", "3", "2", "1"};
        String[] twoM = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

//      var1
        System.out.println("Copy Ar1 to Ar2: " );
        twoM = oneM;
        for (int i = 0; i < twoM.length; i++) {
            System.out.print(twoM[i]);
            System.out.print(" ");
        }
        System.out.println();

        //      var2
        twoM = Arrays.copyOf(oneM, oneM.length);
        System.out.println("Copy Ar1 to Ar2: " );

        for (int i = 0; i < twoM.length; i++) {
            System.out.print(twoM[i]);
            System.out.print(" ");
        }
    }
}
