package JavaAdvanced.Lec4_StreamFilesAndDirectories.LAB;

import java.io.File;
import java.util.Arrays;

public class Task7_ListFiles {
    public static void main(String[] args) {
        File root = new File("C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");
        Arrays.stream(root.listFiles())
                .filter(File::isFile)
                .forEach(f -> System.out.println(f.getName() + ": [" + f.length() + "]"));
    }
}
