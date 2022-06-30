package JavaAdvanced.Lec3_SetsAndMapsAdvanced.LAB;

import java.util.*;

public class Task5_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> studentGrades = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = (scanner.nextLine().split("\\s+"));
            String name = input[0];
            double grade = Double.parseDouble(input[1]);
            List<Double> currentGrade = studentGrades.get(name);
            if (currentGrade == null) {
                currentGrade = new ArrayList<>();
                studentGrades.put(name, currentGrade);
            }
            currentGrade.add(grade);
        }
        for (var entry : studentGrades.entrySet()) {
            System.out.print(entry.getKey() + " -> ");
            double average = 0;
            for (Double grade : entry.getValue()) {
                System.out.printf("%.2f ", grade);
                average += grade;
            }

            System.out.printf("(avg: %.2f)%n", average / entry.getValue().size());
        }

    }
}
