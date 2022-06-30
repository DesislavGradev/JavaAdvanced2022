package JavaAdvanced.Lec1_StackAndQueue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task1_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split("\\s+");
        ArrayDeque<String> buffer = new ArrayDeque<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            buffer.push(arr[i]);
        }
        int sum = Integer.parseInt(buffer.pop());

        while (!buffer.isEmpty()) {
            String operator = buffer.pop();
            int operand = Integer.parseInt(buffer.pop());
            if (operator.equals("+")) {
                sum += operand;
            } else {
                sum -= operand;
            }
        }
        System.out.println(sum);
    }
}
