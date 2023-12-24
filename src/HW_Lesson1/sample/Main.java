package HW_Lesson1.sample;

import HW_Lesson1.files_write.WriteFile;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите заметку: ");
        String note = scanner.nextLine();
        WriteFile.write(note);

        System.out.println("Заметка успешно добавлена!");
    }
}