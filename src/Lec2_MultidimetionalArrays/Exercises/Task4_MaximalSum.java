package Lec2_MultidimetionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        int sum;
        int bestRow = -1;
        int bestCol = -1;
        for (int row = 0; row < rows - 2; row++) {
            for (int col = 0; col < cols - 2; col++) {
                sum = matrix[row][col] + matrix[row][col + 1] + matrix[row][col + 2]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1] + matrix[row + 1][col + 2]
                        + matrix[row + 2][col] + matrix[row + 2][col + 1] + matrix[row + 2][col + 2];
                if (maxSum < sum) {
                    maxSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        for (int row = bestRow; row < bestRow + 3; row++) {
            for (int col = bestCol; col < bestCol + 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
