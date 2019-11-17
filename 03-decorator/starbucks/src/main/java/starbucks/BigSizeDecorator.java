package starbucks;

public class BigSizeDecorator extends SizeDecorator {

    public BigSizeDecorator(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost() * 2.0;
    }
}

