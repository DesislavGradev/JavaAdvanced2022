package Lec8_IteratorsAndComparators.Exercises.Task5_ComparingObjects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Person> people = new ArrayList<>();
        while (!input.equals("END")) {
            String[] peopleData = input.split("\\s+");
            String name = peopleData[0];
            int age = Integer.parseInt(peopleData[1]);
            String town = peopleData[2];
            Person person = new Person(name, age, town);
            people.add(person);
            input = scanner.nextLine();
        }
        int personToCompareIndex = Integer.parseInt(scanner.nextLine());
        Person personToCompare = people.get(personToCompareIndex - 1);
        int totalPeople = people.size();
        int samePeople = 0;
        int differentPeople = 0;

        for (Person person : people) {
            if (personToCompare.compareTo(person) == 0) {
                samePeople++;
            } else {
                differentPeople++;
            }
        }
        if (samePeople == 1) {
            System.out.println("No matches");
        } else {
            System.out.printf("%d %d %d", samePeople, differentPeople, totalPeople);
        }
    }
}
