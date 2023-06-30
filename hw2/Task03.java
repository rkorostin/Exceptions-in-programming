/*
Дан следующий код, исправьте его там, где требуется

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

*/
//Исправленный код
import java.io.FileNotFoundException;
public class Task03 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException {
        System.out.println(a + b);
    }
}

/*
 В данном коде исправлены несколько ошибок. 
- В методе main добавлено объявление throws Exception, чтобы указать, что метод может выбрасывать исключение 
типа Exception.
- В блоке try происходит деление числа a на b и вывод результата. 
Если b равно нулю, возникнет исключение ArithmeticException, отработает блок "catch (Throwable ex)" (родительский класс всех исключений)
- Далее вызывается метод printSum с аргументами 23 и 234. 
В этом методе происходит сложение чисел и вывод результата. 
Если один из аргументов равен null, возникает исключение NullPointerException.
- Затем создается массив abc размером 2 и происходит попытка присвоить значение 9 элементу с индексом 3. 
Такой индекс выходит за пределы массива и вызывает исключение IndexOutOfBoundsException.
*/
