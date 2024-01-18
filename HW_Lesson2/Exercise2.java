package HW_Lesson2;

/*
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
*/

public class Exercise2 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5, 4, 3, 2};
        System.out.println(difference(arr));
    }

    public static int difference(Integer[] arr) {
        if(arr.length == 0){
            System.out.println("Вы ввели пустой массив.");
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        int diff = max - min;
        return diff;
    }
}