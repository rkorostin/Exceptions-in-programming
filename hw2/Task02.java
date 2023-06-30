/*
Если необходимо, исправьте данный код

try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}

В изначальном коде исправлена ошибка деления на ноль. 
В блоке try происходит попытка деления элемента массива intArray[8] на переменную d, 
которая равна нулю. Такое деление вызывает исключение ArithmeticException. 
В блоке catch этот тип исключения перехватывается и выводится сообщение "Catching exception: " + e, 
где e - объект исключения. 
В коде все в порядке, кроме одного - переменная intArray не была объявлена и инициализирована
*/

public class Task02 {
    public static void main(String[] args) {
        try {
            int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; // объявление и инициализация массива
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
