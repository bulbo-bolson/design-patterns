package beverages;

public abstract class CaffeineBeverage {

    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public abstract void brew();

    public void pourInCup() {
        System.out.println("pouring in cup");
    }

    public abstract void addCondiments();

}

