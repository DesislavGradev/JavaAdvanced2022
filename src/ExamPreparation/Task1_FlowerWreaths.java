package ExamPreparation;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Task1_FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] liliesArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int[] rosesArr = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> lilies = new ArrayDeque<>();
        for (int i : liliesArr) {
            lilies.push(i);
        }

        ArrayDeque<Integer> roses = new ArrayDeque<>();
        for (int i : rosesArr) {
            roses.offer(i);
        }
        int wreaths = 0;
        int remainingFlowers = 0;
        int sum = 0;

        while (!lilies.isEmpty() && !roses.isEmpty()) {
            int lily = lilies.pop();
            int rose = roses.poll();

            sum = lily + rose;

            while (sum > 15) {
                lily -= 2;
                sum = lily + rose;
            }

            if (sum == 15) {
                wreaths++;
            } else if (sum < 15) {
                remainingFlowers += sum;
            }
        }
        int additionalWreaths = 0;
        additionalWreaths = remainingFlowers / 15;

        wreaths += additionalWreaths;

        if (wreaths >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreaths);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreaths);
        }
    }
}
