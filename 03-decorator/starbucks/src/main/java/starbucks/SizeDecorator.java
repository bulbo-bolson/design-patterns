package starbucks;

public abstract class SizeDecorator extends Beverage {
    Beverage beverage;

    public SizeDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

}
