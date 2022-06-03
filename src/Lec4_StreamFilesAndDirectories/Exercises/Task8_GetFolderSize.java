package Lec4_StreamFilesAndDirectories.Exercises;

import java.io.File;
import java.util.ArrayDeque;

public class Task8_GetFolderSize {
    public static void main(String[] args) {

        File folder = new File("C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources");
        ArrayDeque<File> directories = new ArrayDeque<>();
        directories.offer(folder);
        int totalSize = 0;
        while (!directories.isEmpty()) {
            File currentDirectory = directories.poll();
            File[] nestedFiles = currentDirectory.listFiles();
            for (File nestedFile : nestedFiles) {
                if (nestedFile.isDirectory()) {
                    directories.offer(nestedFile);
                } else {
                    totalSize += nestedFile.length();
                }
            }
        }
        System.out.println("Folder size: " + totalSize);
    }
}
