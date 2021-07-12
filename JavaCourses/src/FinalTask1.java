import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара");
        double course = scanner.nextDouble();//текущий курс
        System.out.println("Текущий курс: " + course);
        System.out.println("Введите количество рублей для конвертации");
        double rub = scanner.nextDouble();//количество рублей
        System.out.println("Количество рублей: " + rub);
        double dlr = 0;
        if (course > 0) {
            dlr = rub / course;
        } else {
            System.out.println("Курс валюты не положительный");
        }
        dlr = Math.round(dlr * 100);
        System.out.println(dlr + "*100 is: ");
        dlr = dlr / 100f;

        System.out.println("Итого: " + dlr + " долларов");
    }
}
