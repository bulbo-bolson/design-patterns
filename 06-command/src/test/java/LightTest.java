import house.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LightTest {

    @Test
    public void lightOn() {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        int slot = 0;

        remote.setCommand(slot, lightOn, lightOff);
        remote.onButtonWasPushed(slot);

        assertEquals("on", light.getState());
    }

    @Test
    public void lightOff() {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        int slot = 0;

        remote.setCommand(slot, lightOn, lightOff);
        remote.offButtonWasPushed(slot);

        assertEquals("off", light.getState());
    }

    @Test
    public void undoLightOn() {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);
        int slot = 0;

        remote.setCommand(slot, lightOn, lightOff);
        remote.onButtonWasPushed(slot);
        remote.undoCommandWasPushed();

        assertEquals("off", light.getState());
    }
}
