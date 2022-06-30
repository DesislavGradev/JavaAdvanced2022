package JavaAdvanced.Lec4_StreamFilesAndDirectories.LAB;

import java.io.FileInputStream;
import java.io.IOException;

public class Task1_ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            int read = fileInputStream.read();
            while (read != -1) {
                System.out.print(Integer.toBinaryString(read) + " ");
                read = fileInputStream.read();
            }
        } catch (IOException ignored){
        }
    }
}
