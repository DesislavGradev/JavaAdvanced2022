package Lec6_DefiningClasses.LAB.Task3_BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Map<Integer, BankAccount> map = new HashMap<>();
        while (!input.equals("End")) {
            String[] arr = input.split("\\s+");
            String command = arr[0];

            String output = null;
            if (command.equals("Create")) {
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();
                map.put(id, bankAccount);
                output = "Account ID" + id + " created";
            } else if (command.equals("Deposit")) {
                int id = Integer.parseInt(arr[1]);
                int amount = Integer.parseInt(arr[2]);
                BankAccount bankAccount = map.get(id);
                if (bankAccount != null) {
                    bankAccount.deposit(amount);
                    output = "Deposited " + amount + " to ID" + id;
                } else {
                    output = "Account does not exist";
                }
            } else if (command.equals("SetInterest")) {
                double interest = Double.parseDouble(arr[1]);
                BankAccount.setInterestRate(interest);
            } else if (command.equals("GetInterest")) {
                int id = Integer.parseInt(arr[1]);
                int years = Integer.parseInt(arr[2]);
                BankAccount bankAccount = map.get(id);
                if (bankAccount != null) {
                    output = String.format("%.2f ", bankAccount.getInterest(years));
                } else {
                    output = "Account does not exist";
                }
            }
            if (output != null) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }
    }
}
