package home.week2;

/**
 * Вводится строка слов. Вывести слова в обратном порядке.
 */
public class _12Task {
    public static void main(String[] args) {

        String line = "Вводится строка слов. Вывести слова в обратном порядке\n";

        System.out.println("\tДана строка: \n" + line);
        StringBuilder lineRev = new StringBuilder(line);
        String revLine = lineRev.reverse().toString();

        System.out.print("\tПеревернём: ");
        System.out.println(revLine);
    }
}
