package home.week2;

/**
 * Найдите среднее арифметическое массива из 10 элементов типа double. (start...end).
 */
public class _16Task {
    public static void main(String[] args) {
        double[] arr = new double[10];
        System.out.print("Given array: \t");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random()*10;
            System.out.printf("%.2f", arr[i]);
            System.out.print(" ");
        }
        System.out.println();
        double average = 0;
        if (arr.length > 0){
            double sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j];
            }
            average = sum / arr.length;
            System.out.print("Average is: \t");
            System.out.printf("%1.2f",average);
        }
    }
}
