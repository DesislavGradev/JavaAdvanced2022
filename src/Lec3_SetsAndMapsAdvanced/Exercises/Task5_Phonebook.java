package Lec3_SetsAndMapsAdvanced.Exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task5_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> phoneBook = new HashMap<>();
        while (!input.equals("search")) {
            String[] arr = input.split("-");
            String name = arr[0];
            String phoneNumber = arr[1];
            String currentName = phoneBook.get(name);
            if (currentName == null) {
                currentName = phoneNumber;
                phoneBook.put(name , currentName);
            } else {
                phoneBook.replace(name, phoneNumber);
            }
            input = scanner.nextLine();
        }
        String command = scanner.nextLine();
        while (!command.equals("stop")) {
            String searchedNumber = phoneBook.get(command);
            if (searchedNumber == null) {
                System.out.printf("Contact %s does not exist.%n", command);
            } else {
                System.out.println(command + " -> " + searchedNumber);
            }
            command = scanner.nextLine();
        }
    }
}
