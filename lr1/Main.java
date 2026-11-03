import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вариант задания от 1 до 3");
        int choise = in.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Введите число a в километрах");
                int a = in.nextInt();
                int m = a * 1000;
                System.out.println(m);
                break;
            case 2:
                System.out.println("Введите число A");
                int A = in.nextInt();
                System.out.println("Введите число B");
                int B = in.nextInt();
                if (B == 0) {
                    System.out.println("Ошибка: на ноль делить нельзя");
                } else if (A % B == 0) {
                    System.out.println("Делится без остатка");
                } else {
                    System.out.println("Не делится без остатка");
                }
                break;
            case 3:
//                for (int i = 1; i <= 100; i++) {
//                    if (i % 3 == 0) {
//                        System.out.print(i + ",");
//                    }
//                }
                int i=1;
                do {
                    if (i % 3 == 0) {
                        System.out.print(i + ", ");
                    }
                    i++;
                } while (i <= 100);
                break;
            default:
                System.out.print("Ошибка: числа от 1 до 3 нужны");
        }
        in.close();
    }
}