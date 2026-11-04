import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class FileManager1 {
    public void writeToFile(String fileName, String text) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        }
    }

    public void printFileInfo(String fileName) {
        File file = new File(fileName);
        System.out.println("Имя: " + file.getName());
        System.out.println("Размер: " + file.length() + " байт");
        System.out.println("Существует: " + file.exists());
    }

    public void readFromFile(String fileName) throws IOException {
        try (FileReader reader = new FileReader(fileName)) {
            int c;
            System.out.print("Содержимое: ");
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            System.out.println();
        }
    }
}