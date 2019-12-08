import house.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GarageDoorUpTest {

    @Test
    public void doorUp() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand openDoorCommand = new GarageDoorOpenCommand(door);

        remote.setCommand(openDoorCommand);
        remote.butonWasPressed();

        assertEquals("up", door.getDoorState());
    }
}

