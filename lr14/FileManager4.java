import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileManager4 {
    public void writeDoubles(String fileName, int count) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file)) {
            System.out.println("Введите " + count + " значений напряжения:");
            for (int i = 0; i < count; i++) {
                double val = scanner.nextDouble();
                writer.write(val + " ");
            }
        }
    }

    public double calculateAverage(String fileName) throws IOException, ArithmeticException {
        File file = new File(fileName);

        if (!file.exists()) {
            throw new IOException("Файл не найден!");
        }

        double sum = 0;
        int count = 0;
        try (Scanner fileScanner = new Scanner(new FileReader(file))) {
            while (fileScanner.hasNext()) {
                String str = fileScanner.next();
                try {
                    double num = Double.parseDouble(str);
                    sum += num;
                    count++;
                } catch (NumberFormatException e) {
                    // Пропускаем, если не число
                }
            }
        }

        if (count == 0) {
            throw new ArithmeticException("Файл существует, но в нем нет чисел для расчета");
        }
        return sum / count;
    }
}