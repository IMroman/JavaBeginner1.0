import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
/*Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки. Среди данных строк найти строку с максимальным
количеством различных символов. Если таких строк будет много, то вывести первую.

Пример для теста работы программы:

Количество строк: 3
Строка 1: привет
Строка 2: анализ
Строка 3: 111111111111
Ответ: привет*/
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите количество строк");
        int n = scn.nextInt();
        int max = 0;
        int ind = 0;
        System.out.println("Количестов строк: " + n);
        String[] str = new String[n];//длинна массива == количеству строк
        System.out.println("Введите строки");
        str[0] = scn.nextLine();//первая строка
        for (int i = 0; i < n; i++) {
            str[i] = scn.nextLine();
            int p = i + 1;
            System.out.println("Строка " + p + ": " + str[i]);
        }//поиск максимальной строки
        for (int i = 0; i < n; i++) {
            if (max < str[i].length()) {
                max = str[i].length();
                ind = i;
            } else if (max == str[i].length()) {
                continue;
            }
        }
        System.out.println(str[ind]);
    }
}



