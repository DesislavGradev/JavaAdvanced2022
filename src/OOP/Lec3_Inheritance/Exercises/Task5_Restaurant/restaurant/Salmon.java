package OOP.Lec3_Inheritance.Exercises.Task5_Restaurant.restaurant;

import java.math.BigDecimal;

public class Salmon extends MainDish {
    final static double SALMON_GRAMS = 22;

    public Salmon(String name, BigDecimal price) {
        super(name, price, SALMON_GRAMS);
    }
}