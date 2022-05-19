package Lec1_StackAndQueue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String instruction = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        String currentState = "";
        while (!instruction.equals("Home")) {
            if (instruction.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    instruction = scanner.nextLine();
                    continue;
                } else {
                    currentState = history.pop();
                }
            } else {
                if (!currentState.equals("")) {
                    history.push(currentState);
                }
                currentState = instruction;
            }
            System.out.println(currentState);
            instruction = scanner.nextLine();
        }
    }
}
