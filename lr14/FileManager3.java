import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

public class FileManager3 {
    public void generateRandomFile(String fileName, int count) throws IOException {
        Random random = new Random();
        try (FileWriter f = new FileWriter(fileName)) {
            for (int i = 0; i < count; i++) {
                f.write(random.nextInt(100) + "\n");
            }
        }
    }

    public void splitSquares(String sourceFile, String squaresFile, String othersFile) throws IOException {
        try (Scanner scanner = new Scanner(new FileReader(sourceFile));
             FileWriter g = new FileWriter(squaresFile);
             FileWriter h = new FileWriter(othersFile)) {

            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int root = (int) Math.sqrt(num);
                if (root * root == num && num > 0) {
                    g.write(num + "\n");
                } else {
                    h.write(num + "\n");
                }
            }
        }
    }
}