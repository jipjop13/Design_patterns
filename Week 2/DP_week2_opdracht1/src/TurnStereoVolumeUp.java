// a concrete command
public class TurnStereoVolumeUp implements Command {

    ElectronicDevice myDevice;

    public TurnStereoVolumeUp(ElectronicDevice device){

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