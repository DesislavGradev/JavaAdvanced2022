package OOP.Lec5_Polymorphism.Exercises.Task3_WildFarm;

import OOP.Lec5_Polymorphism.Exercises.Task12_VehiclesExtension.Vehicle;

public class Mouse extends Mammal {
    public Mouse(String animalName, Double animalWeight, String livingRegion) {
        super(animalName, "Mouse", animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable) {
            setFoodEaten(getFoodEaten() + food.getQuantity());
        } else {
            System.out.println("Mice are not eating that type of food!");
        }
    }
}
