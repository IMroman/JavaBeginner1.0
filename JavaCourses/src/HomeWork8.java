import java.util.Scanner;

public class HomeWork8 {
    public static void main(String[] args) {
        System.out.println("Введите положительное целое число");
        firstMethod();
    }
    public static int firstMethod(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        if (n<=0){
            System.out.println("Вы ввели не положительное целое число, повторите ввод целого положительного числа");
            return firstMethod();
        } else {
            for (int i = 1;i<n;i++){
                    if(!(i%2==0)){//поставить условие, при котором будет проходить проверка на соответсвие введения именно нечетного числа пользователем
                        //System.out.println("Нечетное число " + i + " в пределе, до " + n);//нечетное число
                        sum = sum+i;
                }
            }
        }System.out.println("Сумма всех нечетных чисел, в пределе до введенного с клавиатуры числа " + n + ", равна = "+ sum);
      return 0;
    }
}
