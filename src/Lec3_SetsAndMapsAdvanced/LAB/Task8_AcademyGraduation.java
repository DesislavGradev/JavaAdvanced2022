package Lec3_SetsAndMapsAdvanced.LAB;

import java.sql.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Task8_AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> graduationStudents = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            double[] scoresArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble)
                    .toArray();
            Double[] scores = new Double[scoresArr.length];
            for (int j = 0; j < scores.length; j++) {
                scores[j] = scoresArr[j];
            }
            graduationStudents.put(name, scores);
        }

        for (var entry : graduationStudents.entrySet()) {
            double sum = 0;
            for (Double score : entry.getValue()) {
                sum += score;
            }
            System.out.printf("%s is graduated with %s%n", entry.getKey(), sum / entry.getValue().length);
        }
    }
}
