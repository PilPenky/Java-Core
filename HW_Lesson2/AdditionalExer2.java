package HW_Lesson2;

import java.util.Arrays;

/*
Написать метод, которому можно передать в качестве аргумента массив, состоящий строго из единиц и нулей (целые числа типа int).
Метод должен заменить единицы в массиве на нули, а нули на единицы.
*/
public class AdditionalExer2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{0, 0, 1, 1, 0, 0};
        System.out.println(Arrays.asList(difference(arr)));
    }

    public static Integer[] difference(Integer[] arr) {
        if (arr.length == 0) {
            System.out.println("Вы ввели пустой массив.");
            System.exit(0);
        }

        String t = "";
        for (int i = 0; i < arr.length; i++) {
            t = String.valueOf(arr[i]);
            if (!t.contains(String.valueOf(0)) && !t.contains(String.valueOf(1))) {
                System.out.println("Массив должен содержать только 0 и 1.");
                System.exit(0);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }
}