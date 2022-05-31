package Lec3_SetsAndMapsAdvanced.Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task6_FixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        Map<String, String> map = new LinkedHashMap<>();
        while (!command.equals("stop")) {
            String name = command;
            String email = scanner.nextLine();
            if (!(email.endsWith("us") || email.endsWith("uk") || email.endsWith("com"))) {
                map.put(name, email);
            }
            command = scanner.nextLine();
        }
        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
