package Lec4_StreamFilesAndDirectories.Exercises;

import java.io.*;

public class Task4_CountCharacterTypes {
    public static void main(String[] args) {
        String pathInput = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        String pathOutput = "C:\\Users\\DezlorD\\Downloads\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt";
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;

        try (FileReader fileReader = new FileReader(pathInput);
             PrintWriter printWriter = new PrintWriter(new FileWriter(pathOutput))) {
            int symbol = fileReader.read();
            while (symbol != -1) {
                char symbolAsChar = (char) symbol;
                if (isVowel(symbolAsChar)) {
                    vowels++;
                } else if (isPunctuation(symbolAsChar)) {
                    punctuation++;
                } else if (!Character.isWhitespace(symbolAsChar)) {
                    consonants++;
                }
                symbol = fileReader.read();
            }
            printWriter.println("Vowels: " + vowels);
            printWriter.println("Consonants: " + consonants);
            printWriter.println("Punctuation: " + punctuation);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean isVowel(char symbolAsChar) {
        return symbolAsChar == 'a' || symbolAsChar == 'o' || symbolAsChar == 'u' || symbolAsChar == 'e' || symbolAsChar == 'i';
    }

    private static boolean isPunctuation(char symbolAsChar) {
        return symbolAsChar == '!' || symbolAsChar == ',' || symbolAsChar == '.' || symbolAsChar == '?';
    }
}
