import java.io.IOException;

public static void main(String[] args) {
    FileManager3 manager = new FileManager3();

    try {
        manager.generateRandomFile("f.txt", 20);
        manager.splitSquares("f.txt", "g.txt", "h.txt");
        System.out.println("Файлы g.txt и h.txt успешно созданы.");
    } catch (IOException e) {
        System.out.println("Ошибка при работе с файлами: " + e.getMessage());
    }
}
