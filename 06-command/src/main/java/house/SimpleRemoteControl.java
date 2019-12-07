package house;

public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {

    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void butonWasPressed() {
        this.command.execute();
    }
}
