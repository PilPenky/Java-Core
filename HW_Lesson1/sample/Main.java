package HW_Lesson1.sample;

import HW_Lesson1.files_write.WriteFile;

import java.io.IOException;
import java.util.Scanner;

/*
Создать приложение с вложенностью пакетов не менее 3-х, где будет класс для входа и несколько классов с логикой.
Пример: приложение для внесения заметок во внешний файл с обязательной фиксацией времени
*/

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите заметку: ");
        String note = scanner.nextLine();
        WriteFile.write(note);

        System.out.println("Заметка успешно добавлена!");
    }
}