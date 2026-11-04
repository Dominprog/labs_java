import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManager2 {
    public void writeNumbers(String fileName, int count) throws IOException {
        Scanner scanner = new Scanner(System.in);
        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите " + count + " целых чисел:");
            for (int i = 0; i < count; i++) {
                writer.write(scanner.nextInt() + "\n");
            }
        }
    }

    public void readAndCountNegative(String fileName) throws IOException {
        int countNegative = 0;
        try (Scanner fileScanner = new Scanner(new FileReader(fileName))) {
            System.out.println("Числа из файла:");
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                if (num < 0) countNegative++;
            }
            System.out.println("\nКоличество отрицательных: " + countNegative);
        }
    }
}