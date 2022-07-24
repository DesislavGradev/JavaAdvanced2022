package OOP.Lec8_ExeptionsAndErrorHandling.LAB;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Task1_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] inputRange = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int start = inputRange[0];
        int end = inputRange[1];
        System.out.printf("Range: [%d...%d]%n", start, end);

        boolean inTheRange = false;

        String input = scanner.nextLine();

        while (!inTheRange) {

            Optional<Integer> number = Optional.empty();

            try {
                number = Optional.of(Integer.parseInt(input));
            } catch (NumberFormatException ignored) {
            }

            if (number.isEmpty() || number.get() < start || number.get() > end) {
                System.out.printf("Invalid number: %s%n", input);
                input = scanner.nextLine();
            } else {
                inTheRange = true;
            }
        }
        System.out.printf("Valid number: %s", input);
    }
}
