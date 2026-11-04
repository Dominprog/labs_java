import java.io.IOException;
import java.util.InputMismatchException;

public static void main(String[] args) {
    String fileName = "f.txt";
    FileManager2 manager = new FileManager2();

    try {
        manager.writeNumbers(fileName, 10);
        manager.readAndCountNegative(fileName);
    } catch (IOException e) {
        System.out.println("Ошибка ввода-вывода: " + e.getMessage());
    } catch (InputMismatchException e) {
        System.out.println("Ошибка ввода: вы ввели не целое число!");
    }
}