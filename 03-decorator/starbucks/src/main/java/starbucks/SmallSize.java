package starbucks;

public class SmallSize extends SizeDecorator {

    public SmallSize(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost();
    }
}
