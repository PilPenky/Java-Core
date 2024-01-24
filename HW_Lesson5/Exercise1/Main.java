package HW_Lesson5.Exercise1;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/*
    Написать функцию, создающую резервную копию всех файлов в директории(без поддиректорий) во вновь созданную папку ./backup
*/
public class Main {
    public static void main(String[] args) throws IOException {
        File folder = new File("./HW_Lesson5/Exercise1/ForTheTask");
        backupCopy(folder);
    }

    public static void backupCopy(File folder) throws IOException {
        Path backup = Files.createDirectories(Paths.get("./HW_Lesson5/Exercise1/backup"));
        for (File file : folder.listFiles()) {
            Path copeFile = Files.copy(file.toPath(), Paths.get("./HW_Lesson5/Exercise1/backup/" + file.getName()), REPLACE_EXISTING);
        }
    }
}