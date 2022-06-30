package OOP.Lec1_WorkingWithAbstraction.Task4_HotelReservation;

public enum Discount {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1);

    private double priceReductionFactor;

    Discount(double priceReductionFactor) {
        this.priceReductionFactor = priceReductionFactor;
    }

    public static Discount parse(String s) {
        switch (s) {
            case "VIP":
                return VIP;
            case "SecondVisit":
                return SECOND_VISIT;
            case "None":
                return NONE;
            default:
                throw new IllegalArgumentException("Unknown enum value " + s);
        }
    }

    public double getPriceReductionFactor() {
        return priceReductionFactor;
    }
}
