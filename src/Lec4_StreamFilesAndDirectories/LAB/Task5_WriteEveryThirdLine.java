package Lec4_StreamFilesAndDirectories.LAB;

import java.io.*;

public class Task5_WriteEveryThirdLine {
    public static void main(String[] args) {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
            BufferedWriter writer = new BufferedWriter(new FileWriter("every-third-line.txt"));
            String line = reader.readLine();
            int counter = 0;
            while (line != null) {
                counter++;
                if (counter % 3 == 0) {
                    writer.write(line);
                    writer.newLine();
                }
                line = reader.readLine();
            }
            reader.close();
            writer.close();
        } catch (IOException ignored) {
        }
    }
}
