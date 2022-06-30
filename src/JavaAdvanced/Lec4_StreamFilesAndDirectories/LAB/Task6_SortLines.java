package JavaAdvanced.Lec4_StreamFilesAndDirectories.LAB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Task6_SortLines {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        Path inPath = Paths.get(path);
        List<String> sortedLines = Files.readAllLines(inPath)
                .stream()
                .sorted()
                .collect(Collectors.toList());
        Path outPath = Paths.get("sorted-lines-output.txt");
        Path write = Files.write(outPath, sortedLines);
    }
}
