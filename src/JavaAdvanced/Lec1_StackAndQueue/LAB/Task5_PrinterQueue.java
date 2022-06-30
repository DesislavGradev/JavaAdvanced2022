package JavaAdvanced.Lec1_StackAndQueue.LAB;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Task5_PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> printer = new ArrayDeque<>();

        while (!input.equals("print")) {
            if (!input.equals("cancel")) {
                printer.offer(input);
            } else {
                if (printer.isEmpty()) {
                    System.out.println("Printer is on standby");
                } else {
                    System.out.println("Canceled " + printer.poll());
                }
            }
            input = scanner.nextLine();
        }
        for (String s : printer) {
            System.out.println(s);
        }

    }
}
