package Lec6_DefiningClasses.Exercises.CompanyRoster;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] inputArr = scanner.nextLine().split("\\s+");
            String name = inputArr[0];
            double salary = Double.parseDouble(inputArr[1]);
            String position = inputArr[3];
            String department = inputArr[4];


        }
    }
}
