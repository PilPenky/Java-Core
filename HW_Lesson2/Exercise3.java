package HW_Lesson2;

/*
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
*/

public class Exercise3 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 0, 0};
        System.out.println(difference(arr));
    }

    public static boolean difference(Integer[] arr) {
        if (arr.length == 0) {
            System.out.println("Вы ввели пустой массив.");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if ((arr[i] == 0) && (arr[i] == arr[i + 1])) {
                return true;
            }
        }
        return false;
    }
}