package OOP.Lec1_WorkingWithAbstraction.Task4_HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        double pricePerDay = Double.parseDouble(input[0]);
        int numberOfDays = Integer.parseInt(input[1]);
        Season season = Season.parse(input[2]);
        Discount discount = Discount.parse(input[3]);

        PriceCalculator priceCalculator = new PriceCalculator(pricePerDay, numberOfDays, season, discount);

        System.out.printf("%.2f", priceCalculator.calculatePrice());

    }
}
