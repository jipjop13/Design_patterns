// a concrete command
public class TurnTVVolumeUp implements Command {

    ElectronicDevice myDevice;

    public TurnTVVolumeUp(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.volumeUp();
    }

    @Override
    public void undo() {
        myDevice.volumeDown();
    }
}