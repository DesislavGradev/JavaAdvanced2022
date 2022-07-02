package OOP.Lec1_WorkingWithAbstraction.Exercises.Task5_JediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readCoordinates(scanner.nextLine());
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] galaxy = new int[rows][cols];

        fillTheGalaxy(rows, cols, galaxy);

        String command = scanner.nextLine();
        long starCollected = 0;
        while (!command.equals("Let the Force be with you")) {

            int[] jediPosition = readCoordinates(command);
            int[] evilPosition = readCoordinates(scanner.nextLine());

            int evilRow = evilPosition[0];
            int evilCol = evilPosition[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (isInBounds(galaxy, evilRow, evilCol)) {
                    galaxy[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int jediRow = jediPosition[0];
            int jediCol = jediPosition[1];

            while (jediRow >= 0 && jediCol < galaxy[1].length) {
                if (isInBounds(galaxy, jediRow, jediCol)) {
                    starCollected += galaxy[jediRow][jediCol];
                }

                jediCol++;
                jediRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(starCollected);
    }

    private static int[] readCoordinates(String command) {
        return Arrays.stream(command.split("\\s+")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillTheGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                galaxy[row][col] = value++;
            }
        }
    }

    private static boolean isInBounds(int[][] galaxy, int row, int col) {
        return row >= 0 && col >= 0 && row < galaxy.length && col < galaxy[row].length;
    }
}
