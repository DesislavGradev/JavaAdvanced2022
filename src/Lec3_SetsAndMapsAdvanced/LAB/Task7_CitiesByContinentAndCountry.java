package Lec3_SetsAndMapsAdvanced.LAB;

import java.util.*;

public class Task7_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Map<String, List<String>>> places = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];
            Map<String, List<String>> currentPlace = places.get(continent);
            if (currentPlace == null) {
                currentPlace = new LinkedHashMap<>();
                places.put(continent, currentPlace);
            }
            List<String> place = currentPlace.get(country);
            if (place == null) {
                place = new ArrayList<>();
                currentPlace.put(country, place);
            }
            place.add(city);
        }
        for (var entry : places.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (var value : entry.getValue().entrySet()) {
                System.out.println("  " + value.getKey() + " -> " + String.join(", ", value.getValue()));
            }
        }
    }
}
