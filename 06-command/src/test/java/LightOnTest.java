import house.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class LightOnTest {

    @Test
    public void setsLight() {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.butonWasPressed();

        assertEquals("on", light.getState());
    }
}
