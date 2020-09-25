package csc241;

public class Pump implements Gas{

    @Override
    public double getPrice(double g) {
        return g * pricePerGallon;
    }
}
