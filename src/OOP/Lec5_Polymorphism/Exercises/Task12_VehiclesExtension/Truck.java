package OOP.Lec5_Polymorphism.Exercises.Task12_VehiclesExtension;

public class Truck extends Vehicle {

    private static final double ADDITIONAL_CONSUMPTION = 1.6;
    private static final double FUEL_LEAK_CORRECTION_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        liters = liters * FUEL_LEAK_CORRECTION_PERCENTAGE;
        super.refuel(liters);
    }
}
