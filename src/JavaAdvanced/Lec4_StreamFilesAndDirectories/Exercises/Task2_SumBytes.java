package JavaAdvanced.Lec4_StreamFilesAndDirectories.Exercises;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task2_SumBytes {
    public static void main(String[] args) {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String line = bufferedReader.readLine();
            long sum = 0;
            while (line != null) {
                char[] charsFromLine = line.toCharArray();
                for (char c : charsFromLine) {
                    sum += c;
                }
                line = bufferedReader.readLine();
            }
            System.out.println(sum);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
