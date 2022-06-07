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
            Employee employee = null;
            switch (inputArr.length) {
                case 4:
                    employee = new Employee(name, salary, position, department);
                    break;
                case 5:
                    if (inputArr[4].matches("\\d+")) {
                        int age = Integer.parseInt((inputArr[4]));
                        employee = new Employee(name, salary, position, department, age);
                    } else {
                        String email = inputArr[4];
                        employee = new Employee(name, salary, position, department, email);
                    }
                    break;
                case 6:
                    String email = inputArr[4];
                    int age = Integer.parseInt(inputArr[5]);
                    employee = new Employee(name, salary, position, department, email, age);
                    break;

            }

        }
    }
}
