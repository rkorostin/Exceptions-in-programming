/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих 
массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя. 
Важно: При выполнении метода единственное исключение, которое пользователь может 
увидеть - RuntimeException, т.е. ваше.
*/

public class Task03 {
    public static void main(String[] args) {
        double[] result = divideArrays(new int[]{2, 3, 4, 5, 6}, new int[]{3, 4, 5, 6, 0});
        for (double i : result) {
            System.out.print(i + " ");
        }
    }
    
    public static double[] divideArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        
        double[] result = new double[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Деление на 0 недопустимо");
            }
            result[i] = (double) arr1[i] / arr2[i];
        }
        
        return result;
    }
}