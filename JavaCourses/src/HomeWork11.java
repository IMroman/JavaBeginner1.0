import java.util.Scanner;

public class HomeWork11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1
        String s = scanner.nextLine();
        int i = scanner.nextInt();
        //2
        int s2 = Integer.parseInt(s);//из строки преобразовали в целочисленную переменную
        //System.out.println(s2 + 5);//теперь число вместо строки
        if (i != s2) {
            //условие, если два числа равны, то вывести большее на экран
            System.out.println(Math.max(i, s2) + " - Большее число, введенное вами;");
            //вывести меньшее число на экран, предварительно переконверстировав его в тип double
            double i2 = (Math.min(i, s2));
            System.out.println(i2 + " - Меньшее число, введенное вами.");
        } else {
            System.out.println("Числа равны");
        }
    }
}
