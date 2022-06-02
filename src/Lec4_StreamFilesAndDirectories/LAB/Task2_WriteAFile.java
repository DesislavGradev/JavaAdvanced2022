package Lec4_StreamFilesAndDirectories.LAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Set;

public class Task2_WriteAFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            Set<Character> punctuation = Set.of(',', '.', '!', '?');
            int read = fileInputStream.read();
            while (read != -1) {

                if (!punctuation.contains((char) read)) {
                    fileOutputStream.write(read);
                }
                read = fileInputStream.read();
            }
        } catch (IOException ignored) {
        }
    }
}
