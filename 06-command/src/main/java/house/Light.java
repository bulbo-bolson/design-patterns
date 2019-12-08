package house;

public class Light {
    private String state;

    public void on() {
        System.out.println("Enabling light");
        state = "on";
    }

    public void off() {
        System.out.println("Shutting down light");
        state = "off";
    }

    public String getState() {
        return this.state;
    }
}
