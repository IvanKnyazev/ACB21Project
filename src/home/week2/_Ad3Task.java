package home.week2;

/**
 * Поменять местами наибольший и наименьший элементы в массиве
 */
public class _Ad3Task {
    public static void main(String[] args) {
        int[] arr = {14, 15, 22, 36, -5, 40, 11, 22};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        int maxNum = arr[0];
        int imaxNum = 0;
        int minNum = arr[0];
        int iminNum = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxNum) {
                maxNum = arr[i];
                imaxNum = i;
            }
            if (arr[i] < minNum) {
                minNum = arr[i];
                iminNum = i;
            }
        }

        arr[iminNum] = maxNum;
        arr[imaxNum] = minNum;

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
}
