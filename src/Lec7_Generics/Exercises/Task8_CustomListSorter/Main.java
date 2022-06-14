package Lec7_Generics.Exercises.Task8_CustomListSorter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        CustomList<String> list = new CustomList<>();
        while (!input.equals("END")) {

            String[] commandElements = input.split("\\s+");
            String command = commandElements[0];
            switch (command) {
                case "Add":
                    String elementToAdd = commandElements[1];
                    list.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(commandElements[1]);
                    list.remove(index);
                    break;
                case "Contains":
                    String elementToSearch = commandElements[1];
                    System.out.println(list.contains(elementToSearch));
                    break;
                case "Swap":
                    int index1 = Integer.parseInt(commandElements[1]);
                    int index2 = Integer.parseInt(commandElements[2]);
                    list.swap(index1, index2);
                    break;
                case "Greater":
                    String elementToCompare = commandElements[1];
                    System.out.println(list.countGreaterThan(elementToCompare));
                    break;
                case "Max":
                    System.out.println(list.getMax());
                    break;
                case "Min":
                    System.out.println(list.getMin());
                    break;
                case "Print":
                    System.out.println(list);
                    break;
                case "Sort":
                    Sorter.sort(list);
                    break;
                default:
                    System.out.println("Invalid Input !");
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
