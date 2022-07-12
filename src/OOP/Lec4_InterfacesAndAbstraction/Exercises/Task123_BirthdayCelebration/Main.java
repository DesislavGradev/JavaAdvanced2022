package OOP.Lec4_InterfacesAndAbstraction.Exercises.Task123_BirthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Birthable> birthableList = new ArrayList<>();
        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] inputSplit = input.split("\\s+");

            switch (inputSplit[0]) {
                case "Citizen":
                    birthableList.add(new Citizen(inputSplit[1],
                            Integer.parseInt(inputSplit[2]),
                            inputSplit[3],
                            inputSplit[4]));
                    break;
                case "Pet":
                    birthableList.add(new Pet(inputSplit[1],
                            inputSplit[2]));
                    break;
            }

            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        birthableList.stream()
                .map(Birthable::getBirthDate)
                .filter(birthDate -> birthDate.endsWith(year))
                .forEach(System.out::println);

    }
}
