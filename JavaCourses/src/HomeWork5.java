import java.util.Scanner;

public class HomeWork5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int num1 = getInt1();//считывает с консоли число и возвращает его
        System.out.println("Введите второе число:");
        int num2 = getInt1();
        char operation = getOperation();//считает с консоли операцию
        int result = calc(num1,num2,operation);//результат вычисления
        System.out.println("Результат операции: "+ result);
    }

    public static int getInt1(){
        int num1;
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            num1 = getInt1();
        }
        return num1;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Ошибка вычисления операции.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}