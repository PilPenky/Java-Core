package HW_Lesson5.Exercise2;

import java.io.*;
import java.sql.Array;
import java.util.Arrays;

/*
Предположить, что числа в исходном массиве из 9 элементов имеют диапазон[0, 3], и представляют собой, например, состояния ячеек поля для игры в крестики-нолики,
где 0 – это пустое поле, 1 – это поле с крестиком, 2 – это поле с ноликом, 3 – резервное значение.
Такое предположение позволит хранить в одном числе типа int всё поле 3х3.
Записать в файл 9 значений так, чтобы они заняли три байта.
*/
public class Main {
    public static void main(String[] args) throws IOException {
        Integer[] arr = new Integer[]{0, 1, 2,   3, 0, 1,   2, 3, 0};
        writToFile(arr);
        Integer[] resArr = conversionStrArray(readFromFile());
        System.out.println("resulArray = " + Arrays.asList(resArr));
    }

    private static void writToFile(Integer[] arr) throws IOException {
        File file = new File("./HW_Lesson5/Exercise2/file.txt");
        FileWriter writerClear = new FileWriter(file, false);
        writerClear.write("");

        long fileSize = file.length();
        System.out.println("File size: " + fileSize + " bytes");

        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("");
            int count = 0;
            int countInMethod = 1;
            int[] arrTrans = new int[3];
            for (int i = 0; i < arr.length; i++) {
                arrTrans[count] = arr[i];
                if (count == 2) {
                    writer.write(fivefoldInBinary(arrTrans, countInMethod));
                    count = 0;
                    countInMethod++;
                    continue;
                }
                count++;
            }
            System.out.println("Recording successful");
            writer.flush();
            fileSize = file.length();
            System.out.println("File size: " + fileSize + " bytes");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String readFromFile() {
        String strArray = "";
        try (FileReader reader = new FileReader("./HW_Lesson5/Exercise2/file.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                strArray = strArray + binaryInFivefold(c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return strArray;
    }

    public static Integer fivefoldInBinary(int[] a, int count) {
        int degree = 0;
        Integer temp = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            int numT = a[i] * ((int) Math.pow(5, degree));
            temp += numT;
            degree++;
        }
        String numStr = "";
        switch (count) {
            case 1:
                numStr = "Первые";
                break;
            case 2:
                numStr = "Вторые";
                break;
            case 3:
                numStr = "Третьи";
                break;
            default:
                break;
        }
        System.out.println(numStr + " три элемента массива после перевода из 10-ой в 5-ую систему счисления: " + temp);
        return temp;
    }

    public static String binaryInFivefold(int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 5;
            temp = b + temp;
            a = a / 5;
        }
        if (temp.length() == 2) {
            temp = "0" + temp;
        }
        return temp;
    }

    public static Integer[] conversionStrArray(String str) {
        Integer[] resulArray = new Integer[str.length()];
        String[] arrayStr = str.split("");
        for (int i = 0; i < arrayStr.length; i++) {
            resulArray[i] = Integer.valueOf(arrayStr[i]);
        }
        return resulArray;
    }
}