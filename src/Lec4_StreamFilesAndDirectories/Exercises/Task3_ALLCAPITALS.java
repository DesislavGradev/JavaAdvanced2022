package Lec4_StreamFilesAndDirectories.Exercises;

import java.io.*;

public class Task3_ALLCAPITALS {
    public static void main(String[] args) {
        String pathInput = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOutput = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(pathInput));
             PrintWriter printWriter = new PrintWriter(new FileWriter(pathOutput))) {
            bufferedReader.lines().forEach(line -> printWriter.println(line.toUpperCase()));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
