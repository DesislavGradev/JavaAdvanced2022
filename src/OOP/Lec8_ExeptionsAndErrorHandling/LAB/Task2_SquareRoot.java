package OOP.Lec8_ExeptionsAndErrorHandling.LAB;

import java.util.Scanner;

public class Task2_SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsString = scanner.nextLine();

        double sqrt = -1;

        try {
            sqrt = squareRoot(Integer.parseInt(numberAsString));
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid");
        }

        if (sqrt != -1) {
            System.out.printf("%.2f%n", sqrt);
        }
        System.out.println("Goodbye");
    }

    public static double squareRoot(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Invalid");
        }

        return Math.sqrt(n);
    }
}
