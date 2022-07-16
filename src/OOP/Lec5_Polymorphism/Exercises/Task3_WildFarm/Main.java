package OOP.Lec5_Polymorphism.Exercises.Task3_WildFarm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        List<Food> foods = new ArrayList<>();

        String input = scanner.nextLine();

        while (!"End".equals(input)) {
            String[] animalTokens = input.split("\\s+");
            createAnimal(animalTokens, animals);

            String[] foodTokes = scanner.nextLine().split("\\s+");
            createFood(foodTokes, foods);
            input = scanner.nextLine();
        }

        for (int i = 0; i < animals.size(); i++) {
            Animal animal = animals.get(i);
            Food food = foods.get(i);

            animal.makeSound();
            animal.eat(food);
        }
        for (int i = 0; i < animals.size(); i++) {
            System.out.println(animals.get(i));
        }
    }

    private static void createFood(String[] foodTokes, List<Food> foods) {
        String foodType = foodTokes[0];
        Integer quantity = Integer.parseInt(foodTokes[1]);

        switch (foodType) {
            case "Vegetable":
                Food vegetable = new Vegetable(quantity);
                foods.add(vegetable);
                break;
            case "Meat":
                Food meat = new Meat(quantity);
                foods.add(meat);
                break;
        }
    }

    private static void createAnimal(String[] animalTokens, List<Animal> animals) {

        String animalType = animalTokens[0];
        String animalName = animalTokens[1];
        Double animalWeight = Double.parseDouble(animalTokens[2]);
        String animalLivingRegion = animalTokens[3];

        switch (animalType) {
            case "Cat":
                String catBreed = animalTokens[4];
                Animal cat = new Cat(animalName, animalWeight, animalLivingRegion, catBreed);
                animals.add(cat);
                break;
            case "Tiger":
                Animal tiger = new Tiger(animalName, animalWeight, animalLivingRegion);
                animals.add(tiger);
                break;
            case "Mouse":
                Animal mouse = new Mouse(animalName, animalWeight, animalLivingRegion);
                animals.add(mouse);
                break;
            case "Zebra":
                Animal zebra = new Zebra(animalName, animalWeight, animalLivingRegion);
                animals.add(zebra);
                break;
        }
    }
}
