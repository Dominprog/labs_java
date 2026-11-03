import java.util.Scanner;

public class Main {

    static class Employee {
        String fullname;
        double salary;

        Employee(String fullname, double salary) {
            this.fullname = fullname;
            this.salary = salary;
        }
    }

    static class Report {
        static void generateReport(Employee[] employees) {
            for (int i = 0; i < employees.length; i++) {
                System.out.printf("%-15s %10.2f%n", employees[i].fullname, employees[i].salary);
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания от 1 до 4: ");
        int choise = in.nextInt();
        in.nextLine();

        switch (choise) {
            case 1:
                System.out.println("Введите первую строку: ");
                String a1 = in.nextLine();
                System.out.println("Введите вторую строку: ");
                String a2 = in.nextLine();
                boolean res = a1.equals(a2);
                if (res) {
                    System.out.println("Строки одинаковые");
                } else {
                    System.out.println("Строки разные");
                }
                break;

            case 2:
                System.out.println("Введите строку: ");
                String b = in.nextLine().toLowerCase();
                String sets = "аеёиоуыэюяaeiou";
                int gl = 0;
                int sogl = 0;
                for (int i = 0; i < b.length(); i++) {
                    char c = b.charAt(i);
                    if (sets.indexOf(c) != -1) {
                        gl++;
                    } else if (c >= 'a' && c <= 'z' || c >= 'а' && c <= 'я') {
                        sogl++;
                    }
                }
                System.out.println("Гласных: " + gl);
                System.out.println("Согласных: " + sogl);
                break;

            case 3:
                Employee[] employees = new Employee[3];
                employees[0] = new Employee("Дмитрович Д.К.", 1600.25);
                employees[1] = new Employee("Сенько М.В.", 2700.85);
                employees[2] = new Employee("Кара В.С.", 999.2);
                Report.generateReport(employees);
                break;

            case 4:
                String c4 = "aAXa aeffa aGha aza ax23a a3sSa";
                String[] words = c4.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].matches("a[a-z]+a")) {
                        System.out.println(words[i]);
                    }
                }
                break;

            default:
                System.out.println("Введите число от 1 до 4");
        }
        in.close();
    }
}