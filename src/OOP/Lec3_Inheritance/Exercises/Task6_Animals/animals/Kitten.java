package OOP.Lec3_Inheritance.Exercises.Task6_Animals.animals;

public class Kitten extends Cat {
    public Kitten(String name, int age) {
        super(name, age, "Female");
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
