/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
Если длины массивов не равны, необходимо как-то оповестить пользователя.
*/

public class Task02 {
    public static void main(String[] args) {
        int[] result = subtractArrays(new int[]{2, 3, 4, 5, 6, 7}, new int[]{3, 4, 5, 6, 7});
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    public static int[] subtractArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        }
        
        int[] result = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i] - arr2[i];
        }

        return result;
    }
}
