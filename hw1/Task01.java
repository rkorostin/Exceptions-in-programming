// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения (без обработки)

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        //System.out.printf("Вы ввели число %d \n", Method1("Введите число: "));
        
        // int num1 = Method1("Введите 1-e число: ");
        // int num2 = Method1("Введите 2-e число: ");
        // System.out.printf("Частное num1 и num2: %d \n", Method2(num1, num2));

        Method3();



    }

    //Метод, генерирующий InputMismatchException
    public static int Method1(String text) {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.print(text);
        i = sc.nextInt();
        return i;
    }

    //Метод, генерирующий ArithmeticException
    public static int Method2(int num1, int num2) {
        int res = num1/num2;
        return res;
    }

    //Метод, генерирующий NullPointerException
    public static void Method3() {
        String str = null;
        str.length();
    }

}