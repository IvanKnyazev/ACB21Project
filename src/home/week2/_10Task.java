package home.week2;

/**
 * Создайте переменные a и b. Просуммируйте их, а результат запишите в переменную result.
 Если result больше 5, то присвойте переменной result значение 5.
 Если же она меньше 5-ти - то умножьте ее на 10. Выведите на экран значение переменной result.
 */
public class _10Task {
    public static void main(String[] args) {

        int a = 1;
        int b = 5;

        int result = a + b <= 5 ? (a+b)*10 : 5;
        System.out.println(result);
    }
}
