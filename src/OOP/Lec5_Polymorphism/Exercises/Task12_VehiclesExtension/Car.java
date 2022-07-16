package OOP.Lec5_Polymorphism.Exercises.Task12_VehiclesExtension;

public class Car  extends Vehicle{

    private static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }
}
