package ExamPreparation;

import java.util.Scanner;

public class Task2_Bomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        char[][] field = new char[size][size];

        String[] commands = scanner.nextLine().split(",");

        int row = 0;
        int col = 0;
        int totalBombs = 0;
        int disarmedBombs = 0;
        for (int i = 0; i < field.length; i++) {
            String line = scanner.nextLine().replace(" ", "");
            field[i] = line.toCharArray();

            if (line.contains("s")) {
                row = i;
                col = line.indexOf("s");
            }
        }
        for (char[] line : field) {
            for (int i = 0; i < line.length; i++) {
                if (line[i] == 'B') {
                    totalBombs++;
                }
            }
        }
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "up":
                    if (row != 0) {
                        row--;
                    }
                    break;
                case "down":
                    if (row != field.length - 1) {
                        row++;
                    }else {

                    }
                    break;
                case "left":
                    if (col != 0) {
                        col--;
                    }
                    break;
                case "right":
                    if (col != field.length - 1) {
                        col++;
                    }
                    break;
            }
            if (field[row][col] == 'B') {
                disarmedBombs++;
                field[row][col] = '+';
                System.out.println("You found a bomb!");
                if (disarmedBombs == totalBombs) {
                    System.out.println("Congratulations! You found all bombs!");
                    return;
                }
            } else if (field[row][col] == 'e') {
                System.out.printf("END! %d bombs left on the field", totalBombs - disarmedBombs);
                return;
            }
        }

        System.out.printf("%d bombs left on the field. Sapper position: (%d,%d)", totalBombs - disarmedBombs, row, col);
    }
}
