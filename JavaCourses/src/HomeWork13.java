import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите: I love java 8 Я люблю java 14 core1");
        String s = scanner.nextLine();
//Выведите слова, состоящие только из латиницы.
        String str1 = s.replaceAll("([А-Яа-я0-9\\s]+)", " ");//с помощью регулярки находим любой символ (число) + все символы от А до Я и заменяем на пробел
        //str1 = str1.replaceAll("core ","core");//это конечно дублирование кода, но так мы убрали лишний пробел,
        // но и без него количество слов будет подсчитано корректно
        System.out.println(str1);//слова только из латиницы
        String[] res = str1.split(" ");
        System.out.println(res.length);
    }
}