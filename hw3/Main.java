import java.io.FileWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите ФИО и номер телефона (через пробел): ");
            String input = scanner.nextLine();

            try {
                String[] data = input.split(" ");

                if (data.length != 4) {
                    throw new IllegalArgumentException("Неверное количество данных. Повторите ввод");
                }

                String lastName = data[0];
                String firstName = data[1];
                String middleName = data[2];
                int phoneNumber = Integer.parseInt(data[3]);

                String fileName = lastName + ".txt";
                FileWriter fileWriter = new FileWriter(fileName, true);
                fileWriter.write(lastName + " " + firstName + " " + middleName + " " + phoneNumber + "\n");
                fileWriter.close();

                System.out.println("Данные успешно записаны в файл");
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Ошибка: " + e.getMessage());
                System.out.println("Повторите ввод");
            } catch (Exception e) {
                System.out.println("Ошибка при записи в файл");
                e.printStackTrace();
            }
        }

        scanner.close();
    }
}