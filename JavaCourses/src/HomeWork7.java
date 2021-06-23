import java.util.Scanner;

public class HomeWork7 {
    public static void main(String[] args) {
        //Пользователь вводит размер массива и данные с клавиатуры в массив
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        System.out.println( "Введите данные массива");
        int[] array = new int[size];
            for (int i = 0; i<size;i++){
                array[i] = scanner.nextInt();
            }
        //System.out.println("Вывод заполненного массива:" + "\n");
            for (int i =0; i<size;i++){
                //System.out.println(i + " элемент массива = " + array[i]+";"+"\n");
            }
        //Сравнить элементы массива с заранее заданными константами x, y, z.
        //Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
            int x = 5;
            int y = 10;
            int z = 95;
            for (int i = 0; i<size;i++)
                if (array[i] == x){
                    //System.out.println(i + " элемент массива = " + array[i] + " и равен переменной x = " + x + ";");
                    System.out.println("Данное значение имеется в константах");
                    break;
        }
                else if (array[i] == y){
                    //System.out.println(i + " элемент массива = " + array[i] + " и равен переменной x = " + x + ";");
                    System.out.println("Данное значение имеется в константах");
                    break;
        }
                else if (array[i] == z){
                    //System.out.println(i + " элемент массива = " + array[i] + " и равен переменной x = " + z + ";");
                    System.out.println("Данное значение имеется в константах");
                    break;
                }
        }
}
