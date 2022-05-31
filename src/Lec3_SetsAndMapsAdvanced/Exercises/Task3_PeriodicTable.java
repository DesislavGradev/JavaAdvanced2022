package Lec3_SetsAndMapsAdvanced.Exercises;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task3_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Set<String> elements = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] compounds = scanner.nextLine().split("\\s+");
            for (String element : compounds) {
                elements.add(element);
            }
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }
}
