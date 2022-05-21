package Lec1_StackAndQueue.Exercises;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Task2_BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s");
        int n = Integer.parseInt(arr[0]);
        int s = Integer.parseInt(arr[1]);
        int x = Integer.parseInt(arr[2]);
        arr = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            stack.push(Integer.parseInt(arr[i]));
        }
        for (int i = 1; i <= s; i++) {
            stack.pop();
        }
        if (stack.contains(x)) {
            System.out.println("true");
        } else if(stack.isEmpty()) {
            System.out.println(0);
        } else {
            System.out.println(Collections.min(stack));
        }
    }
}
