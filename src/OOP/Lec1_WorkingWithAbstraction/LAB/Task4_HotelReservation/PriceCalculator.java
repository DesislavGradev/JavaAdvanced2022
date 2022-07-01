package OOP.Lec1_WorkingWithAbstraction.LAB.Task4_HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Season season;
    private Discount discount;

    public PriceCalculator(double pricePerDay, int days, Season season, Discount discount) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.season = season;
        this.discount = discount;
    }

    public double calculatePrice() {
        return pricePerDay * days * season.getMultiplier() * discount.getPriceReductionFactor();
    }
}
