import java.util.Random;

public class HomeWork14 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[15];//массив из 15 элементов
        int[] value = new int[20];//массив значений +-20
        int max = 0;//примет максимальное число массива value
        int min = 0;//примет минимальное число массива value
        for (int i = 0; i < array.length; i++) {
            value[i] = random.nextInt(20);//диапазон значений
            if (value[i] % 2 == 0) {
                value[i] = random.nextInt(20) - 20;
                System.out.println(i + " Отрицательные элементы массива: " + value[i]);
            } else {
                value[i] = random.nextInt(21);
                System.out.println(i + " Не отрицательные элементы массива: " + value[i]);
            }
            if (max <= value[i]) {
                max = value[i];
            } else if (min >= value[i]) {
                min = value[i];
            }
        }
        System.out.println(max + " - Максимальное значение, " + min + " - Минимальное значение.");
        //System.out.println((Math.abs(min)) + " - По модулю наибольшее число из min");
        if (max > Math.abs(min)) {
            System.out.println(max + " - Максимальное значение в сравнении с min по модулю");
        } else {
            System.out.println(Math.abs(min) + " - Максимальное значение по модулю в сравнении с max");
        }
    }
}
