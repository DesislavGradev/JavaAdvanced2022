package ExamPreparation;

import java.util.Scanner;

public class Task2_PawnWars {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[][] chessBoard = new char[8][8];
        int bRow = 0;
        int bCol = 0;
        int wRow = 0;
        int wCol = 0;
        for (int i = 0; i < chessBoard.length; i++) {
            String line = scanner.nextLine();
            chessBoard[i] = line.toCharArray();

            if (line.contains("b")) {
                bRow = i;
                bCol = line.indexOf("b");
            } else if (line.contains("w")) {
                wRow = i;
                wCol = line.indexOf("w");
            }
        }
        boolean isHit = false;
        while (wRow != 0 && bRow != 7 && !isHit) {
            if (whiteHits(wRow, wCol, bRow, bCol)) {
                String coordinates = findCoordinates(bRow, bCol);
                System.out.printf("Game over! White capture on %s.", coordinates);
                isHit = true;
            }
            wRow -= 1;
            if (blackHits(wRow, wCol, bRow, bCol)) {
                String coordinates = findCoordinates(wRow, wCol);
                System.out.printf("Game over! Black capture on %s.", coordinates);
                isHit = true;
            }
            bRow += 1;
        }
        if (!isHit) {
            if (wRow == 0) {
                System.out.printf("Game over! White pawn is promoted to a queen at %s.", findCoordinates(wRow, wCol));
            } else {
                System.out.printf("Game over! Black pawn is promoted to a queen at %s.", findCoordinates(bRow, bCol));
            }
        }
    }

    private static String findCoordinates(int row, int col) {
        char[] colArr = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
        char[] rowArr = new char[]{'8', '7', '6', '5', '4', '3', '2', '1'};
        StringBuilder sb = new StringBuilder();
        sb.append(colArr[col]).append(rowArr[row]);
        return sb.toString();

    }

    private static boolean whiteHits(int wRow, int wCol, int bRow, int bCol) {
        if (wRow - 1 == bRow && (wCol + 1 == bCol || wCol - 1 == bCol)) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean blackHits(int wRow, int wCol, int bRow, int bCol) {
        if (bRow + 1 == wRow && (bCol + 1 == wCol || bCol - 1 == wCol)) {
            return true;
        } else {
            return false;
        }
    }

    private static void printChessBoard(char[][] chessBoard) {
        for (char[] chars : chessBoard) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

}

