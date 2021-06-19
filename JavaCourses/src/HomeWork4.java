import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        double p = (x + y + z) /3d;
        System.out.println(p);//AVG
        p = Math.floor(p) /2;//AVG/2 ~ min
        System.out.println(p);
        if (p>3){
            System.out.println(p + " Программа выполнена корректно");// if p >3
        }
        else {System.out.println(p + " < 3");
        }
    }
}
