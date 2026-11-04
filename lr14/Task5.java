import java.io.IOException;

public static void main(String[] args) {
    FileManager5 manager = new FileManager5();

    try {
        manager.generateFile("f.txt", 10);
        int count = manager.countInRange("f.txt", 1, 100);
        System.out.println("Количество чисел в диапазоне от 1 до 100: " + count);
    } catch (IOException e) {
        System.out.println("Ошибка при работе с файлами: " + e.getMessage());
    }
}