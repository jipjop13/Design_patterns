// a concrete command
public class TurnStereoOn implements Command {

    ElectronicDevice myDevice;

    public TurnStereoOn(ElectronicDevice device){

        myDevice = device;
    }

    public void execute() {

        myDevice.on();
    }

    @Override
    public void undo() {
        myDevice.off();
    }
}
