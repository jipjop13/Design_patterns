// a concrete command
public class TurnStereoVolumeDown implements Command {

    ElectronicDevice myDevice;

    public TurnStereoVolumeDown(ElectronicDevice device){

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