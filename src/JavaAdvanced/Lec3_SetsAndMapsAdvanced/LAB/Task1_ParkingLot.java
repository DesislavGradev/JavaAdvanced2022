package JavaAdvanced.Lec3_SetsAndMapsAdvanced.LAB;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1_ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input[0].equals("END")) {
            String direction = input[0];
            String licencePlate = input[1];

            if (direction.equals("IN")) {
                parkingLot.add(licencePlate);
            } else {
                parkingLot.remove(licencePlate);
            }
            input = scanner.nextLine().split(", ");
        }
        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String s : parkingLot) {
                System.out.println(s);
            }
        }
    }
}
