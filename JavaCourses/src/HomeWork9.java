import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avg = 0;
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        System.out.println("Введите данные массива");
        double[] u = new double[size];
        double[] array = new double[size];

            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextDouble();//ввод данных массива типа double
                //System.out.println(array[i]); //double array
            }

        //AVG
            for (int d = 0; d<size;d++){
                avg = avg + array[d];
            }   avg = avg/size;
                //System.out.println("Среднее арифметическое элементов массива = " + avg);

        //array[i]*AVG
            for (int i = 0; i<size; i++) {
            u[i] = array[i] * avg;
                System.out.println(i+ " элемент массива = "+ array[i]+" умножается на среднее арифметическое = "+avg+ ". Произведение равно = " + u[i]);
        }
    }
}