package HW_Lesson1.files_write;

import HW_Lesson1.date_add.DateNow;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class WriteFile {
    public static void write(String note) throws IOException {
        String file = "TheNotes.txt";
        String[][] allToysArray = readFile(file);
        String date = DateNow.date();
        Path path = Paths.get(file);

        if (allToysArray.length != 0) {
            Files.write(path, "\n".getBytes(), StandardOpenOption.APPEND);
        }

        Files.write(path, (date + " ->").getBytes(), StandardOpenOption.APPEND);
        String[] allWordsNote = note.split(" ");

        for (int i = 0; i < allWordsNote.length; i++) {
            Files.write(path, (" " + allWordsNote[i]).getBytes(), StandardOpenOption.APPEND);
        }
    }
    public static String[][] readFile(String file) throws FileNotFoundException {
        Scanner scannerCount = new Scanner(new File(file));
        int x = 0;
        while (scannerCount.hasNextLine()) {
            String line = scannerCount.nextLine();
            x += 1;
        }
        scannerCount.close();

        Scanner scanner = new Scanner(new File(file));
        String[][] twoDimArray = new String[x][4];
        int i = 0;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] temp = line.split(",");
            for (int j = 0; j < temp.length; j++) {
                twoDimArray[i][j] = temp[j];
            }
            i += 1;
        }
        scanner.close();
        return twoDimArray;
    }
}