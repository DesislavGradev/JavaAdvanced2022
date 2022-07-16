package OOP.Lec5_Polymorphism.Exercises.Task12_VehiclesExtension;

public class Bus extends Vehicle {

    private boolean isEmpty;
    private static final double ADDITIONAL_FULL_BUS_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.isEmpty = true;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public String drive(double kilometers, boolean empty) {
        this.setEmpty(empty);
        return super.drive(kilometers);
    }
    public void setEmpty(boolean empty) {
        if (isEmpty && !empty) {
            setFuelConsumption(getFuelConsumption() + ADDITIONAL_FULL_BUS_CONSUMPTION);
        }
        if (!isEmpty && empty) {
            setFuelConsumption((getFuelConsumption() - ADDITIONAL_FULL_BUS_CONSUMPTION));
        }
    }
}
