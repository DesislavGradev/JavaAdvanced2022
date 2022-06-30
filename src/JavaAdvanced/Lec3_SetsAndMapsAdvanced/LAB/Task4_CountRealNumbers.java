package JavaAdvanced.Lec3_SetsAndMapsAdvanced.LAB;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task4_CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();
        Map<Double, Integer> numbersAndOccurrences = new LinkedHashMap<>();
        for (double value : input) {
            Integer currentValue = numbersAndOccurrences.get(value);
            if (currentValue == null) {
                numbersAndOccurrences.put(value, 1);
            } else {
                numbersAndOccurrences.put(value, currentValue +1);
            }
        }
        for (var entry : numbersAndOccurrences.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
