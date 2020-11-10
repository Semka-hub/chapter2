import java.util.Arrays;
import java.util.Scanner;

public class ChapterTwo {

    public static void main(String[] args) {

        /* Переменные для всех задач */
        final Double A = 12.5;
        final Double B = 100.75;

        String firstName = "Semyon";
        String lastName = "Golubev";
        String text;

        int fib1 = 0;
        int fib2 = 1;
        int sum = fib1 + fib2;
        int startOfNumber;
        int number = 1;

        int[] array = new int[]{1, 6, 2, 4, 1, 0, 3, 8, 3, 2, 7, 5, 9, 6};

        Scanner scanner = new Scanner(System.in);

        /* Первая задача */
        Double average = (A + B) / 2.0;

        /* Вторая задача */
        System.out.println("Full name: " + firstName + ' ' + lastName);

        /* Третья задача */
        System.out.println("Числа Фибоначчи:\n1. " + fib1 + "\n2. " + fib2);
        for (int i = 3; i <= 15; i++) {
            System.out.println(i + ". " + sum);
            fib1 = fib2;
            fib2 = sum;
            sum = fib1 + fib2;
        }

        /* Четвёртая задача */
        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        sortBubble(array);
        System.out.println("Массив после сортировки: " + Arrays.toString(array));

        /* Пятая задача */
        System.out.print("Введите строку: ");
        text = scanner.next();
        startOfNumber = text.length();

        try {

            do {
                startOfNumber--;
            } while ((text.charAt(startOfNumber - 1) >= '0' ) && (text.charAt(startOfNumber - 1) <= '9' ));

            number += Integer.parseInt(text.substring(startOfNumber, text.length()));
            text = text.substring(0, startOfNumber) + number;
            System.out.println("Строка после изменения: " + text);
        } catch (Exception e) {
            System.out.println("Неверный формат строки.");
        }
    }

    /* Метод сортировки пузырьком */
    static private void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

}
