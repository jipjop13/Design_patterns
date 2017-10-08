// the client
public class PlayWithRemote{
    
    public static void main(String[] args){
        
        // create command receiver
        ElectronicDevice newTV = RemoteControl.getTV();

        // create invoker
        DeviceButton b = new DeviceButton();

        /////////////////////////////////////tv control /////////////////////////////

        // create a concrete command, register the receiver
        TurnTVOn tvOnCommand = new TurnTVOn(newTV);

        // invoke command
        b.execute(tvOnCommand);
        
        // create another concrete command        
        TurnTVOff tvOffCommand = new TurnTVOff(newTV);
        
        // invoke another concrete command
        b.execute(tvOffCommand);

        // create another concrete command
        TurnTVVolumeUp turnTVVolumeUp = new TurnTVVolumeUp(newTV);

        // invoke another concrete command
        b.execute(turnTVVolumeUp);

        // create another concrete command
        TurnTVVolumeDown turnTVVolumeDown = new TurnTVVolumeDown(newTV);

        // invoke another concrete command
        b.execute(turnTVVolumeDown);

        ////////////////////////////stereo control ///////////////////////////////////////////

        // create command receiver
        ElectronicDevice newStereo = RemoteControl.getStereo();

        // create a concrete command, register the receiver
        TurnStereoOn StereoOnCommand = new TurnStereoOn(newStereo);

        // invoke command
        b.execute(StereoOnCommand);

        // create another concrete command
        TurnStereoOff stereoOffCommand = new TurnStereoOff(newStereo);

        // invoke another concrete command
        b.execute(stereoOffCommand);

        // create another concrete command
        TurnStereoVolumeUp turnStereoVolumeUp = new TurnStereoVolumeUp(newStereo);

        // invoke another concrete command
        b.execute(turnStereoVolumeUp);

        // create another concrete command
        TurnStereoVolumeDown turnStereoVolumeDown = new TurnStereoVolumeDown(newStereo);

        // invoke another concrete command
        b.execute(turnStereoVolumeDown);

        ////////////////////////////undo /////////////////////////////


        b.undo();
        b.undo();
        b.undo();
        b.undo();
        b.undo();
        b.undo();

    }
}