package house;

public class Light {
    private String state;

    public void on() {
        System.out.println("Enabling light");
        state = "on";
    }

    public String getState() {
        return this.state;
    }
}
