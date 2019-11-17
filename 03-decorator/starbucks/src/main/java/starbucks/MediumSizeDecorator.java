package starbucks;

public class MediumSizeDecorator extends SizeDecorator {

    public MediumSizeDecorator(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost() * 1.5;
    }
}
