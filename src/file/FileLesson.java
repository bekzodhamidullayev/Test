package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLesson {

    public static void main(String[] args) {
        File file = new File("C:\\");
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
        }

        try (FileWriter fileWriter = new FileWriter("C:\\My project\\Collections\\src\\resources\\test");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
