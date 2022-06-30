package JavaAdvanced.Lec5_FunctionalPrograming.LAB;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Task4_AddVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<Double> printer = p -> System.out.printf("%.2f%n", p);

        UnaryOperator<Double> addVat = p -> p * 1.20;

        List<Double> pricesWithVat = Arrays.stream(scanner.nextLine().split(", "))
                .map(Double::parseDouble)
                .map(addVat)
                .collect(Collectors.toList());

        System.out.println("Prices with VAT:");
        pricesWithVat.forEach(printer);
    }
}
