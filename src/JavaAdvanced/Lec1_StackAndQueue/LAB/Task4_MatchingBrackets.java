package JavaAdvanced.Lec1_StackAndQueue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task4_MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expresion = scanner.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expresion.length(); i++) {
            char ch = expresion.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else if (ch == ')') {
                int startIndex = stack.pop();
                String bracketExpr = expresion.substring(startIndex, i + 1);
                System.out.println(bracketExpr);
            }
        }
    }
}
