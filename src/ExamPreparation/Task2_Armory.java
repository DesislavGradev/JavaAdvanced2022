package ExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2_Armory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        char[][] armory = new char[n][n];

        int officerX = 0;
        int officerY = 0;
        boolean hasMirrors = false;
        Map<String, int[]> mirrors = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            armory[i] = line.toCharArray();

            if (line.contains("A")) {
                officerX = i;
                officerY = line.indexOf("A");
            }
        }

        for (int i = 0; i < armory.length; i++) {
            for (int j = 0; j < armory.length; j++) {
                String mirrorName;
                if (armory[i][j] == 'M') {
                    if (!hasMirrors) {
                        hasMirrors = true;
                        mirrorName = "Mirror1";
                        int[] mirrorPos = new int[2];
                        mirrorPos[0] = i;
                        mirrorPos[1] = j;
                        mirrors.put(mirrorName, mirrorPos);
                    } else {
                        mirrorName = "Mirror2";
                        int[] mirrorPos = new int[2];
                        mirrorPos[0] = i;
                        mirrorPos[1] = j;
                        mirrors.put(mirrorName, mirrorPos);
                    }
                }
            }
        }
        while (true) {
            String command = scanner.nextLine();
            switch (command) {
                case "up":

                    break;
                case "down":

                    break;
                case "left":

                    break;
                case "right":

                    break;
            }
        }
    }
}
