package OOP.Lec3_Inheritance.Exercises.Task4_NeedForSpeed;

public class Car extends Vehicle {
    final static double DEFAULT_FUEL_CONSUMPTION = 3;
    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        super.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
