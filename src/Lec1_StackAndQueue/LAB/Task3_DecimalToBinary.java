package Lec1_StackAndQueue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task3_DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int decimal = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean isZero = false;

        if (decimal == 0) {
            isZero = true;
        }
        if (isZero) {
            System.out.println(decimal);
        } else {
            while (decimal != 0) {
                stack.push(decimal % 2);
                decimal /= 2;
            }
            for (Integer i : stack) {
                System.out.print(i);
            }
        }
    }
}
