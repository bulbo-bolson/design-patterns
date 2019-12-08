package house;

public class GarageDoor {
    private String doorState;

    public GarageDoor() {}

    public void up() {
        System.out.println("putting door up");
        doorState = "up";
    }

    public void down() {
        System.out.println("putting door down");
        doorState = "down";
    }

    public String getDoorState() {
        return doorState;
    }
}
