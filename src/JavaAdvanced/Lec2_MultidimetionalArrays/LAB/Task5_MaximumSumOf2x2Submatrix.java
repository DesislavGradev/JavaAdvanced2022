package JavaAdvanced.Lec2_MultidimetionalArrays.LAB;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_MaximumSumOf2x2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        int maxSum = Integer.MIN_VALUE;
        int[][] resultMatrix = new int[2][2];
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int sum = matrix[row][col] + matrix[row][col + 1]
                        + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if (maxSum < sum) {
                    maxSum = sum;
                    resultMatrix = new int[][]{
                            {matrix[row][col], matrix[row][col + 1]},
                            {matrix[row + 1][col], matrix[row + 1][col + 1]}
                    };
                }
            }
        }
        for (int[] arr : resultMatrix) {
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println(maxSum);
    }
}
