import java.util.Scanner;

public class HomeWork10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк матрицы");//x = matrice.length
        int x = scanner.nextInt();
        System.out.println("Введите количество столбцов матрицы");
        int y = scanner.nextInt();
        System.out.println("Заполните матрицу, в которой "+ x + " строк/и, и " + y + " столбца/ов");
        int [][] matrice  = new int[x][y];
            for (int i = 0; i<matrice.length;i++)
            {
                System.out.println("Заполните "+ i +" индекс строки матрицы");
                    for (int r = 0; r < matrice[i].length;r++){
                        System.out.print("Заполните "+ r +" индекс столбца матрицы ");
                        matrice[i][r] = scanner.nextInt();
                }
        } for (int o = 0; o<y;o++){
            System.out.print(matrice[0][o] +" элемент матрицы * 3"+" = "+(matrice[0][o] * 3) +"; ");
        }
    }
}
