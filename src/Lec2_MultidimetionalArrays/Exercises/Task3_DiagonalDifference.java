package Lec2_MultidimetionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Task3_DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int primaryDiag = 0;
        int secondaryDiag = 0;

        for (int i = 0; i < size; i++) {
            primaryDiag += matrix[i][i];
        }
        int row = size - 1;
        int col = 0;
        while (isInBounds(row, col, matrix)) {
            secondaryDiag += matrix[row][col];
            row--;
            col++;
        }
        int output = Math.abs(primaryDiag - secondaryDiag);
        System.out.println(output);
    }

    private static boolean isInBounds(int row, int col, int[][] matrix) {
                return (row >=0 && row < matrix.length && col >= 0 && col < matrix[row].length);
    }
}
