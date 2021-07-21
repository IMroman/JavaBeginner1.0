import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
/*Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
Среди данных строк найти строку с максимальным
количеством различных символов.
Если таких строк будет много, то вывести первую.

Пример для теста работы программы:

Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет*/

        Scanner scn = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int n = scn.nextInt();
        scn.nextLine();
        int symbols = 0;
        String words = "";

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            String str = scn.nextLine();
            int a = chars(str);
            if (a > symbols) {
                symbols = a;
                words = str;
            }
        }
        System.out.println(words);
    }

    public static int chars(String p) {
        boolean[] b = new boolean[Character.MAX_VALUE];
        for (int i = 0; i < p.length(); i++) {
            b[p.charAt(i)] = true;
        }

        int val2 = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i]) {
                val2++;
            }
        }
        return val2;
    }
}


