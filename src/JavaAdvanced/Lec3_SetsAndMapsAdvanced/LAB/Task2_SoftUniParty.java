package JavaAdvanced.Lec3_SetsAndMapsAdvanced.LAB;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Task2_SoftUniParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();

        while (!input.equals("PARTY")) {
            char ch = input.charAt(0);
            if (Character.isDigit(ch)) {
                vip.add(input);
            } else {
                regular.add(input);
            }
            input = scanner.nextLine();
        }
        String guest = scanner.nextLine();
        while (!guest.equals("END")) {
            vip.remove(guest);
            regular.remove(guest);
            guest = scanner.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        for (String s : vip) {
            System.out.println(s);
        }
        for (String s : regular) {
            System.out.println(s);
        }
    }
}
