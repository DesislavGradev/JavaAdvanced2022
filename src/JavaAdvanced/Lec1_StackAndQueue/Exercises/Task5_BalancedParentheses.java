package JavaAdvanced.Lec1_StackAndQueue.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task5_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sequence = scanner.nextLine();
        ArrayDeque<Character> openingBrackets = new ArrayDeque<>();
        boolean isBalanced = true;
        for (int i = 0; i < sequence.length(); i++) {
            char ch = sequence.charAt(i);
            if (ch == '{' || ch == '[' || ch == '(') {
                openingBrackets.push(ch);
            } else {
                if (openingBrackets.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char bracketToClose = openingBrackets.pop();
                if (bracketToClose == '{' && ch != '}') {
                    isBalanced = false;
                    break;
                } else if (bracketToClose == '[' && ch != ']') {
                    isBalanced = false;
                    break;
                } else if (bracketToClose == '(' && ch != ')') {
                    isBalanced = false;
                    break;
                }
            }
        }
        if (isBalanced && openingBrackets.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}