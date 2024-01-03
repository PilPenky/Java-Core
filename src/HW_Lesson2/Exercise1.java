package HW_Lesson2;

/*
Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
*/

public class Exercise1 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 1, 2, 3, 4};
        System.out.println(countEvenNumbers(arr));
    }

    public static int countEvenNumbers(Integer[] arr) {
        if(arr.length == 0){
            System.out.println("Вы ввели пустой массив.");
        }

        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven;
    }
}