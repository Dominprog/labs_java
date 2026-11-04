import java.io.IOException;

public static void main(String[] args) {
    String fileName = "school.txt";
    FileManager1 manager = new FileManager1();

    try {
        manager.writeToFile(fileName, "Школа №15, город Минск");
        manager.printFileInfo(fileName);
        manager.readFromFile(fileName);
    } catch (IOException e) {
        System.out.println("Ошибка работы с файлом: " + e.getMessage());
    }
}