package Lec4_StreamFilesAndDirectories.LAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Task3_CopyBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt");

            int read = fileInputStream.read();

            PrintWriter writer = new PrintWriter(fileOutputStream);
            while (read != -1) {
                if (read == ' ') {
                    writer.print(' ');
                } else if (read == 10) {
                    writer.println();
                } else {
                    writer.print(read);
                }
                read = fileInputStream.read();
            }
            writer.close();
        } catch (IOException ignored) {
        }

    }
}
