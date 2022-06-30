package JavaAdvanced.Lec5_FunctionalPrograming.Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Task1_ConsumerPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputStrings = scanner.nextLine().split("\\s+");

        Consumer<String> printer = System.out::println;
        Arrays.stream(inputStrings).forEach(printer);
    }
}
