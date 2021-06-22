import java.util.Scanner;

public class HomeWork6 {
    static Scanner scanner = new Scanner(System.in);
//1. Пользователю предлагается на выбор ввести массу или расстояние. Пример:
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние:");
        firstMethod();//считывает с консоли число и возвращает его
    }
//Выбрать что переводить (если массу)
    public static int firstMethod(){
        int oneOrTwo = scanner.nextInt();//пользовательский ввод числа в переменную oneOrTwo
        if(oneOrTwo == 1){
            System.out.println("Введите количество массы: ");
            int a = scanner.nextInt();//пользовательский ввод числа в переменную a
                if (a>0){
                System.out.println("Масса = " + a + " кг");}
                    else if (a==0){
                    System.out.println("Вы ввели нулевую массу. Введите 1 для повтора программы.");
                    return firstMethod();
                    }
                    else {
                    System.out.println("Вы ввели отрицательное число. Введите 1 для повтора программы.");
                    return firstMethod();
                    }
//Выбрать что переводить (если расстояние)
        } else if (oneOrTwo == 2){
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут.");
            int numLogic = scanner.nextInt();
                switch (numLogic){
                case 1:
                    //numLogic = scanner.nextInt();
                    System.out.println("Введите количество метров:");
                    numLogic = scanner.nextInt();
                    System.out.println("Метры: " + numLogic);
                    System.out.println("Мили: " + (float)numLogic / 1609);//долго морочился, но ключ так и не нашел
                    System.out.println("Ярды: " + numLogic * 1.094F);
                    System.out.println("Футы: " + (numLogic * 3.281));
                    break;
                case 2:
                    System.out.println("Введите количество миль:");
                    numLogic = scanner.nextInt();
                    System.out.println("Мили: " + numLogic);
                    System.out.println("Метры: " + numLogic * 1609);
                    System.out.println("Ярды: " + numLogic * 1760);
                    System.out.println("Футы: " + (numLogic * 5280));
                    break;
                case 3:
                    System.out.println("Введите количество ярдов:");
                    numLogic = scanner.nextInt();
                    System.out.println("Ярды: " + numLogic);
                    System.out.println("Метры: " + (float)numLogic / 1.094F);
                    System.out.println("Мили: " + (float)numLogic / 1760);
                    System.out.println("Футы: " + (numLogic * 3));
                    break;
                case 4:
                    System.out.println("Введите количество футов: ");
                    numLogic = scanner.nextInt();
                    System.out.println("Футы: " + (numLogic));
                    System.out.println("Метры: " + (numLogic/3.281F));
                    System.out.println("Мили: " + (float)numLogic / 5280);
                    System.out.println("Ярды: " + numLogic / 3f);
                    break;
                default:
                    System.out.println("Ошибка вычисления операции.Введите 2 для повтора программы.");
                    return firstMethod();
            }
        }
        else {
            System.out.println("Ошибка. Введите 1 для рассчета массы или 2 для рассчета расстояния.");
            return firstMethod();
        }
        return oneOrTwo;
    }
}