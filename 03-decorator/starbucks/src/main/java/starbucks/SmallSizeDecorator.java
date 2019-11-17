package starbucks;

public class SmallSizeDecorator extends SizeDecorator {

    public SmallSizeDecorator(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost();
    }
}
