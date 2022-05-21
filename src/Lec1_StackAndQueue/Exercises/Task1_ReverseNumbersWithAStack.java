package Lec1_StackAndQueue.Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1_ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (String s : arr) {
            stack.push(Integer.parseInt(s));
        }
        for (Integer i : stack) {
            System.out.print(i + " ");
        }
    }
}
