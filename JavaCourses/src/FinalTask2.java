import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {
        /*Напишите программу, которая позволит решить простое уравнение относительно x.
        Программа принимает на вход строку длиной 5 символов.
        Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
        Первым, третьим и пятым символом являются две цифры (от 0 до 9) и буква ‘x’ (обозначает неизвестное) в любом порядке. Нужно найти неизвестное.*/
        Scanner sc = new Scanner(System.in);
        String str;//длина строкового массива в 5 символов
        do {
            System.out.println("Введите 5 символов уравнения с одной переменной x");
            str = sc.nextLine();
            break;
        } while (str.length() < 9);
        char at = str.charAt(0);//первый строчный символ, или x, введенный пользаком;
        char ay = str.charAt(2);//третий строчный символ, или x, введенный пользаком;
        char au = str.charAt(4);//пятый  строчный символ, или x, введенный пользаком;
        int a, b, c, d, e, f;//сохраним чары сюда
        //сложение
        if (str.charAt(1) == '+' && str.charAt(3) == '=') {
            if (at == 'x') {
                System.out.println("Ввод: " + at + '+' + ay + '=' + au);
                a = au - ay;
                System.out.println("Вывод: x=" + a);
            } else if (ay == 'x') {
                System.out.println("Ввод: " + at + '+' + ay + '=' + au);
                b = au - at;
                System.out.println("Вывод: x=" + b);
            } else if (au == 'x') {
                System.out.println("Ввод: " + at + '+' + ay + '=' + au);
                c = at - '0' + ay - '0';//нагуглил такой лайфхак
                System.out.println("Вывод: x=" + c);
            }
        }
        //вычитание
        else if ((str.charAt(1) == '-') && str.charAt(3) == '=') {
            if (at == 'x') {
                System.out.println("Ввод: " + at + '-' + ay + '=' + au);
                d = au - '0' + ay - '0';
                System.out.println("Вывод: x=" + d);
            } else if (ay == 'x') {
                System.out.println("Ввод: " + at + '-' + ay + '=' + au);
                e = at - au;
                System.out.println("Вывод: x=" + e);
            } else if (au == 'x') {
                System.out.println("Ввод: " + at + '-' + ay + '=' + au);
                f = at - ay;
                System.out.println("Вывод: x=" + f);
            }
        }
    }
}