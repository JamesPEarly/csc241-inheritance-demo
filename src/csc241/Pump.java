package csc241;

public class Pump implements Gas{

    @Override
    public double getPrice(double g) {
        return g * PRICE_PER_GALLON;
    }
}
