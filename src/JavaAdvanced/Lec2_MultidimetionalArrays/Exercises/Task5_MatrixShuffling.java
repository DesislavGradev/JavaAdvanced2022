package JavaAdvanced.Lec2_MultidimetionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] command = input.split("\\s+");
            if (!(command[0].equals("swap") && command.length == 5)) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
                continue;
            }
            int row1 = Integer.parseInt(command[1]);
            int col1 = Integer.parseInt(command[2]);
            int row2 = Integer.parseInt(command[3]);
            int col2 = Integer.parseInt(command[4]);
            if (!(isInBounds(row1, col1, matrix) && isInBounds(row2, col2, matrix))) {
                System.out.println("Invalid input!");
            } else {
                String temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                for (String[] str : matrix) {
                    for (String s : str) {
                        System.out.print(s + " ");
                    }
                    System.out.println();
                }
            }
            input = scanner.nextLine();
        }
    }

    private static boolean isInBounds(int row, int col, String[][] matrix) {
        return (row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length);
    }

    private static boolean isNotInBounds(int row, int col, String[][] matrix) {
        return !(row >= 0 && row < matrix.length && col >= 0 && col < matrix[row].length);
    }
}
