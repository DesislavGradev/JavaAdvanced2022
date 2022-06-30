package JavaAdvanced.ExamPreparation;

import java.util.Scanner;

public class Task2_Armory {

    private static int row = 0;
    private static int col = 0;
    private static int spentMoney = 0;
    private static boolean isInArmory = true;
    private static boolean enoughSpent = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] armory = new char[n][n];

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            armory[i] = line.toCharArray();

            if (line.contains("A")) {
                row = i;
                col = line.indexOf("A");
            }
        }
        String command = scanner.nextLine();
        while (true) {
            switch (command) {
                case "up":
                    move(armory, -1, 0);
                    break;
                case "down":
                    move(armory, 1, 0);
                    break;
                case "left":
                    move(armory, 0, -1);
                    break;
                case "right":
                    move(armory, 0, 1);
                    break;
            }

            if (!isInArmory || enoughSpent) {
                break;
            }
            command = scanner.nextLine();
        }
        if (!isInArmory) {
            System.out.println("I do not need more swords!");
        } else {
            System.out.println("Very nice swords, I will come back for more!");
        }
        System.out.printf("The king paid %d gold coins.%n", spentMoney);
        printMatrix(armory);
    }

    private static void move(char[][] armory, int rowModifier, int colModifier) {
        int nextRow = row + rowModifier;
        int nextCol = col + colModifier;

        if (!isInBounds(armory, nextRow, nextCol)) {
            armory[row][col] = '-';
            isInArmory = false;
            return;
        }
        if (Character.isDigit(armory[nextRow][nextCol])) {
            spentMoney += Character.getNumericValue(armory[nextRow][nextCol]);
        }
        if (spentMoney >= 65) {
            enoughSpent = true;

        }
        if (armory[nextRow][nextCol] == 'M') {
            armory[row][col] = '-';
            armory[nextRow][nextCol] = 'A';
            row = nextRow;
            col = nextCol;
            findOtherMirror(armory);
            return;
        }

        armory[row][col] = '-';
        armory[nextRow][nextCol] = 'A';
        row = nextRow;
        col = nextCol;
    }

    private static void findOtherMirror(char[][] armory) {
        for (int i = 0; i < armory.length; i++) {
            for (int j = 0; j < armory[i].length; j++) {
                if (armory[i][j] == 'M') {
                    armory[row][col] = '-';
                    armory[i][j] = 'A';
                    row = i;
                    col = j;
                }
            }
        }
    }

    private static void printMatrix(char[][] armory) {
        for (char[] chars : armory) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(char[][] armory, int r, int c) {
        return r >= 0 && r < armory.length && c >= 0 && c < armory[r].length;
    }
}
