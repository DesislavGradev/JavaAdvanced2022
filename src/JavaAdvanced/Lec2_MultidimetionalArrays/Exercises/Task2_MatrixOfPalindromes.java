package JavaAdvanced.Lec2_MultidimetionalArrays.Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_MatrixOfPalindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int rows = dimensions[0];
        int cols = dimensions[1];
        String[][] matrix = new String[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                char outer = (char) ('a' + row);
                char inner = (char) (outer + col);
                String palindrome = String.valueOf(outer) + inner + outer;
                matrix[row][col] = palindrome;
            }
        }
        for (String[] row : matrix) {
            for (String s : row) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
