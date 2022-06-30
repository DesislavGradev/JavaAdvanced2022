package JavaAdvanced.ExamPreparation;

import java.util.Scanner;

public class Task2_MouseAndCheese {
    private static int row = 0;
    private static int col = 0;
    private static int cheeseCount = 0;
    private static boolean isInField = true;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        for (int i = 0; i < field.length; i++) {
            String line = scanner.nextLine();
            field[i] = line.toCharArray();

            if (line.contains("M")) {
                row = i;
                col = line.indexOf("M");
            }
        }

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            switch (command) {
                case "up":
                    moveMouse(field, -1, 0);
                    break;
                case "down":
                    moveMouse(field, 1, 0);
                    break;
                case "left":
                    moveMouse(field, 0, -1);
                    break;
                case "right":
                    moveMouse(field, 0, 1);
                    break;
            }
            if (!isInField) {
                break;
            }

            command = scanner.nextLine();
        }
        if (!isInField) {
            System.out.println("Where is the mouse?");
        }

        if (cheeseCount >= 5) {
            System.out.println("Great job, the mouse is fed " + cheeseCount + " cheeses!");
        } else {
            System.out.println("The mouse couldn't eat the cheeses, she needed " + (5 - cheeseCount) + " cheeses more.");
        }
        printMatrix(field);
    }

    private static void moveMouse(char[][] field, int rowModifier, int colModifier) {
        int nextRow = row + rowModifier;
        int nextCol = col + colModifier;

        boolean ifBonus = false;
        if (!isInBounds(field, nextRow, nextCol)) {
            field[row][col] = '-';
            isInField = false;
            return;
        }

        if (field[nextRow][nextCol] == 'c') {
            cheeseCount++;
        } else if (field[nextRow][nextCol] == 'B') {
            ifBonus = true;
        }

        field[row][col] = '-';
        field[nextRow][nextCol] = 'M';
        row = nextRow;
        col = nextCol;

        if (ifBonus) {
            moveMouse(field, rowModifier, colModifier);
        }
    }

    private static boolean isInBounds(char[][] field, int r, int c) {
        return r >= 0 && r < field.length && c >= 0 && c < field[r].length;
    }

    private static void printMatrix(char[][] field) {
        for (char[] chars : field) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }
}
