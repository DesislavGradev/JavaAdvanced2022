package OOP.Lec3_Inheritance.Exercises.Task6_Animals.animals;

public class Tomcat extends Cat {
    public Tomcat(String name, int age) {
        super(name, age, "Male");
    }

    @Override
    public String produceSound() {
        return "MEOW";
    }
}
