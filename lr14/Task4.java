import java.io.IOException;
import java.util.InputMismatchException;

public static void main(String[] args) {
    String fileName = "voltage.txt";
    FileManager4 manager = new FileManager4();

    try {
        manager.writeDoubles(fileName, 10);
        double avg = manager.calculateAverage(fileName);
        System.out.println("Среднее напряжение: " + avg);
    } catch (IOException e) {
        System.out.println("Ошибка ввода-вывода: " + e.getMessage());
    } catch (InputMismatchException e) {
        System.out.println("Ошибка ввода: нужно вводить числа!");
    } catch (ArithmeticException e) {
        System.out.println("Ошибка вычисления: " + e.getMessage());
    }
}