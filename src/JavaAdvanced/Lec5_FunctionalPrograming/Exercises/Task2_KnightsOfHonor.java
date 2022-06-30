package JavaAdvanced.Lec5_FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Task2_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputNames = scanner.nextLine().split("\\s+");

        Consumer<String> printer = s -> System.out.println("Sir " + s);
        Arrays.stream(inputNames).forEach(printer);
    }
}
