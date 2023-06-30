/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает
введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
вместо этого, необходимо повторно запросить у пользователя ввод данных.
*/

package hw2;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        float n = getNumberFromUser("Введите число: ");
        System.out.printf("Вы ввели число -> %f", n);

    }

    public static float getNumberFromUser(String text) {
        float i;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.print(text);
            if (sc.hasNextFloat()) {
                i = sc.nextFloat();
                break;
            } else {
                System.out.println("Вы ввели не число");
            }
        }
        return i;
    }
}