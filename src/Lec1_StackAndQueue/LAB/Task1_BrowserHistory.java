package Lec1_StackAndQueue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1_BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String instruction = scanner.nextLine();
        ArrayDeque<String> stackBack = new ArrayDeque<>();
        ArrayDeque<String> stackForward = new ArrayDeque<>();
        String currentState = "";
        while (!instruction.equals("Home")) {
            if (!(instruction.equals("back") || instruction.equals("forward"))) {
                if (!currentState.equals("")) {
                    stackBack.push(currentState);
                    stackForward.clear();
                }
                currentState = instruction;

            } else if (instruction.equals("back")) {
                if (stackBack.isEmpty()) {
                    System.out.println("no previous URLs");
                    instruction = scanner.nextLine();
                    continue;
                } else {
                    stackForward.push(currentState);
                    currentState = stackBack.pop();
                }
            } else {
                if (stackForward.isEmpty()) {
                    System.out.println("no next URLs");
                    instruction = scanner.nextLine();
                    continue;
                } else {
                    stackBack.push(currentState);
                    currentState = stackForward.pop();
                }
            }
            System.out.println(currentState);
            instruction = scanner.nextLine();
        }
    }
}
