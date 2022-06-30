package JavaAdvanced.Lec2_MultidimetionalArrays.LAB;

import java.util.Scanner;

public class Task3_IntersectionOfTwoMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        char[][] firstMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            firstMatrix[row] = scanner.nextLine()
                    .replaceAll("\\s+", "").toCharArray();
        }

        char[][] secondMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            secondMatrix[row] = scanner.nextLine()
                    .replaceAll("\\s+", "").toCharArray();
        }
        char[][] endMatrix = new char[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                endMatrix[row][col] = firstMatrix[row][col] == secondMatrix[row][col] ? firstMatrix[row][col] : '*';
                }
            }
        for (char[] arr : endMatrix) {
            for (char c : arr) {
                System.out.print(c + " ");
            }
            System.out.println();
        }


    }
}
