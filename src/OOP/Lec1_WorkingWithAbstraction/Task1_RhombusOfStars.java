package OOP.Lec1_WorkingWithAbstraction;

import java.util.Scanner;

public class Task1_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        printRhombus(n);
    }

    private static void printRhombus(int n) {
        printTopHalf(n);
        printBottomHalf(n);
    }

    private static void printBottomHalf(int n) {
        for (int i = n - 1; i > 0; i--) {
            printRow(n, i);
        }
    }

    private static void printTopHalf(int n) {
        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
    }

    private static void printRow(int start, int end) {
        for (int j = 0; j < start - end; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < end; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
