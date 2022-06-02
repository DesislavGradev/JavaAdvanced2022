package Lec4_StreamFilesAndDirectories.LAB;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task4_ExtractIntegers {
    public static void main(String[] args) {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Scanner scanner = new Scanner(fileInputStream);
            PrintWriter writer = new PrintWriter(new FileOutputStream("integer-out.txt"));
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    writer.println(scanner.next());
                } else {
                    scanner.next();
                }
            }
            writer.close();
        } catch (IOException ignored) {
        }
    }
}
