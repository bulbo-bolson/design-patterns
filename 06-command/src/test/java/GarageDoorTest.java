import house.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GarageDoorTest {

    @Test
    public void doorUp() {
        RemoteControl remote = new RemoteControl();
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand openDoorCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(door);
        int slot = 0;

        remote.setCommand(slot, openDoorCommand, doorCloseCommand);
        remote.onButtonWasPushed(slot);

        assertEquals("up", door.getDoorState());
    }

    @Test
    public void doorDown() {
        RemoteControl remote = new RemoteControl();
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand openDoorCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(door);
        int slot = 0;

        remote.setCommand(slot, openDoorCommand, doorCloseCommand);
        remote.offButtonWasPushed(slot);

        assertEquals("down", door.getDoorState());
    }

    @Test
    public void undoDoorUp() {
        RemoteControl remote = new RemoteControl();
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand openDoorCommand = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand doorCloseCommand = new GarageDoorCloseCommand(door);
        int slot = 0;

        remote.setCommand(slot, openDoorCommand, doorCloseCommand);
        remote.onButtonWasPushed(slot);
        remote.undoCommandWasPushed();

        assertEquals("down", door.getDoorState());
    }
}

