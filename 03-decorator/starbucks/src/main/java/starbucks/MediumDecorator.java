package starbucks;

public class MediumDecorator extends SizeDecorator {

    public MediumDecorator(Beverage beverage) {
        super(beverage);
    }

    public double cost() {
        return beverage.cost() * 1.5;
    }
}
