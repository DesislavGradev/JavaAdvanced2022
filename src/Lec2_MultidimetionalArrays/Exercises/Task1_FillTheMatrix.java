package Lec2_MultidimetionalArrays.Exercises;

import java.util.Scanner;

public class Task1_FillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        String pattern = input[1];
        int[][] matrix = new int[size][size];
        switch (pattern) {
            case "A":
                matrix = patternA(size);
                break;
            case "B":
                matrix = patternB(size);
                break;
        }
        for (int[] arr : matrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    private static int[][] patternB(int size) {
        int[][] matrix = new int[size][size];
        int start = 1;
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = start;
                    start++;
                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = start;
                    start++;
                }
            }
        }
        return matrix;
    }


    private static int[][] patternA(int size) {
        int[][] matrix = new int[size][size];
        int start = 1;
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = start;
                start++;
            }
        }
        return matrix;
    }
}
