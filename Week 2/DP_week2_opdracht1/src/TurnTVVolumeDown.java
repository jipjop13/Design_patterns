// a concrete command
public class TurnTVVolumeDown implements Command {

    ElectronicDevice myDevice;

    public TurnTVVolumeDown(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.volumeDown();
    }

    @Override
    public void undo() {
        myDevice.volumeUp();
    }
}