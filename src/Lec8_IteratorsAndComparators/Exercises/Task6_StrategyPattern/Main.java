package Lec8_IteratorsAndComparators.Exercises.Task6_StrategyPattern;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        TreeSet<Person> nameSet = new TreeSet(new NameComparator());
        TreeSet<Person> ageSet = new TreeSet<>(new AgeComparator());
         while (n-- > 0) {
            String[] personData = scanner.nextLine().split("\\s+");
            String name = personData[0];
            int age = Integer.parseInt(personData[1]);
            Person person = new Person(name, age);

            nameSet.add(person);
            ageSet.add(person);
        }
        for (Person person : nameSet) {
            System.out.println(person);
        }

        for (Person person : ageSet) {
            System.out.println(person);
        }
    }
}
