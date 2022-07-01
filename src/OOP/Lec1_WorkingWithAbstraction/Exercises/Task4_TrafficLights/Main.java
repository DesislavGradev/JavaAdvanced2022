package OOP.Lec1_WorkingWithAbstraction.Exercises.Task4_TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> inputColors = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String inputColor : inputColors) {
            Color color = Color.valueOf(inputColor);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLights.add(trafficLight);
        }

        int n = Integer.parseInt(scanner.nextLine());
        while (n-- >0) {
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getCurrentColor() + " ");
            }
            System.out.println();
        }
    }
}

