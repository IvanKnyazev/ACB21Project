package home.week2;

/**
 * Найти слово, стоящее в тексте под номером 3 и вывести его первую букву
 */
public class _13Task {
    public static void main(String[] args) {

        String text = "Класс String содержит основные методы для работы со строками";
        System.out.println("enter text: " + text);

        String[] text1 = text.split("\\s+");
        String word3 = text1[3];
        System.out.println("искомое слово в тексте: " + word3);

        char[] wrd = word3.toCharArray();
        System.out.println("первая буква в слове: " + wrd[0]);
    }
}
