package HW_Lesson2;

import java.util.Arrays;

/*
Написать метод, принимающий на вход массив чисел и параметр n.
Метод должен осуществить циклический (последний элемент при сдвиге становится первым) сдвиг всех элементов массива на n позиций;
*/
public class AdditionalExer1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        int n = 2;
        System.out.println(Arrays.asList(difference(arr, n)));
    }

    public static Integer[] difference(Integer[] arr, int n) {
        if (arr.length == 0) {
            System.out.println("Вы ввели пустой массив.");
            System.exit(0);
        }
        if ((arr.length <= n) || n <= 0) {
            System.out.println("Введите правильное значение для 'n'.");
            System.exit(0);
        }

        for (int i = 0; i < n; i++) {
            // Убираем первый элемент в буфер, а на его место ставим хвостовой элемент
            int buffer = arr[0];
            arr[0] = arr[arr.length - 1];
            // Циклично сдвигаем весь массив
            for (int j = 1; j < arr.length - 1; j++) {
                arr[arr.length - j] = arr[arr.length - j - 1];
            }
            // Ставим буферный элемент в 1 ячейку
            arr[1] = buffer;
        }
        return arr;
    }
}