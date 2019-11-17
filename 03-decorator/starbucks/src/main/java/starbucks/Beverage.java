package starbucks;

public abstract class Beverage {
    String description;
    double price;
    String size;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public double getPrice() {
        return price;
    }
}
