/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
*/

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        try {
            String input = getInputFromUser("Введите строку: ");
            if (input.isEmpty()) {
                throw new Exception("Пустые строки вводить нельзя");
            }
            System.out.println("Вы ввели строку: " + input);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static String getInputFromUser(String text) {
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        return sc.nextLine();
    }
}

/*
В блоке try вызывается метод getInputFromUser, который запрашивает у пользователя ввод строки и возвращает ее. 
Если введенная строка пустая, выбрасывается исключение типа Exception с сообщением "Пустые строки вводить нельзя". 
В блоке catch это исключение перехватывается и выводится сообщение "Ошибка: " + e.getMessage(), где e - объект исключения.
*/
