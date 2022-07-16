package OOP.Lec5_Polymorphism.Exercises.Task12_VehiclesExtension;

import java.text.DecimalFormat;

public class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double kilometers) {
        double fuelNeeded = kilometers * fuelConsumption;
        DecimalFormat df = new DecimalFormat("#.##");
        if (fuelNeeded <= fuelQuantity) {
            fuelQuantity -= fuelNeeded;
            return String.format("%s travelled %s km", this.getClass().getSimpleName(), df.format(kilometers));
        } else {
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }
    }

    public void refuel(double liters) {
        if (liters <= 0) {
            System.out.println("Fuel must be a positive number");
            return;
        }
        if (liters > tankCapacity - fuelQuantity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        fuelQuantity += liters;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), fuelQuantity);
    }
}