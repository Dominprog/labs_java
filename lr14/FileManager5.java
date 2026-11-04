import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class FileManager5 {
    public void generateFile(String fileName, int count) throws IOException {
        Random random = new Random();
        try (FileWriter writer = new FileWriter(fileName)) {
            for (int i = 0; i < count; i++) {
                writer.write(random.nextInt(150) - 20 + "\n");
            }
        }
    }

    public int countInRange(String fileName, int min, int max) throws IOException {
        int count = 0;
        try (Scanner scanner = new Scanner(new FileReader(fileName))) {
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                if (num >= min && num <= max) {
                    count++;
                }
            }
        }
        return count;
    }
}