package RegularExam;

import java.util.Scanner;

public class Task2_StickyFingers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        String[] commands = scanner.nextLine().split(",");

        int row = 0;
        int col = 0;
        for (int i = 0; i < field.length; i++) {
            String line = scanner.nextLine().replace(" ", "");
            field[i] = line.toCharArray();

            if (line.contains("D")) {
                row = i;
                col = line.indexOf("D");
            }
        }
        int nextRow = row;
        int nextCol = col;
        int pocket = 0;
        boolean isCaught = false;
        for (String command : commands) {
            if (isCaught) {
                break;
            }
            switch (command) {
                case "up":
                    if (row != 0) {
                        nextRow = row - 1;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        continue;
                    }
                    break;
                case "down":
                    if (row != field.length - 1) {
                        nextRow = row + 1;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        continue;
                    }
                    break;
                case "left":
                    if (col != 0) {
                        nextCol = col - 1;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        continue;
                    }
                    break;
                case "right":
                    if (col != field.length - 1) {
                        nextCol = col + 1;
                    } else {
                        System.out.println("You cannot leave the town, there is police outside!");
                        continue;
                    }
                    break;
            }

            if (field[nextRow][nextCol] == '$') {
                pocket += nextRow * nextCol;
                System.out.printf("You successfully stole %d$.%n", nextRow * nextCol);
            }

            if (field[nextRow][nextCol] == 'P') {
                isCaught = true;
            }
            if (isCaught) {
                field[row][col] = '+';
                field[nextRow][nextCol] = '#';
            } else {
                field[row][col] = '+';
                field[nextRow][nextCol] = 'D';
            }

            row = nextRow;
            col = nextCol;
        }
        if (isCaught) {
            System.out.printf("You got caught with %d$, and you are going to jail.%n", pocket);
        } else {
            System.out.printf("Your last theft has finished successfully with %d$ in your pocket.%n", pocket);
        }
        printField(field);
    }

    private static void printField(char[][] field) {
        for (char[] chars : field) {
            for (int i = 0; i < chars.length; i++) {
                char aChar = chars[i];
                if (i != chars.length - 1) {
                    System.out.print(aChar + " ");
                } else {
                    System.out.println(aChar);
                }
            }
        }
    }
}
