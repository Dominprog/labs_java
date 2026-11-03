import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Выберите задание от 1 до 2");
        int choise = in.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Введите число n:");
                int n = in.nextInt();
                int[] mas = new int[n];
                System.out.println("Введите элементы массива");
                for (int i = 0; i < n; i++) {
                    mas[i] = in.nextInt();
                }
                int max = mas[0];
                int index = 0;
                for (int i = 0; i < n; i++) {
                    if (max < mas[i]) {
                        max = mas[i];
                        index = i;
                    }
                }
                System.out.println("Индекс максимального числа: " + index);
                break;
            case 2:

                int[][] mass = new int[5][7];
                System.out.println("Введите элементы массива: ");
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass[i].length; j++) {
                        System.out.print("Элемент [" + i + "] [" + j + "]:");
                        mass[i][j] = in.nextInt();
                    }
                }
                System.out.println("Введите число X на сколько умножить матрицу: ");
                int x = in.nextInt();
                for (int i = 0; i < mass.length; i++) {
                    for (int j = 0; j < mass.length; j++) {
                        mass[i][j] *= x;
                        System.out.print(mass[i][j] + ",");
                    }
                }
                break;
            default:
                System.out.println("Введите 1 или 2");
        }
        in.close();
    }
}