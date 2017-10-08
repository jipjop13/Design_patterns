public class RemoteControl {

    // return a command receiver
    public static ElectronicDevice getTV(){

        return new Television();
    }

    // return a command receiver
    public static ElectronicDevice getStereo(){

        return new Stereo();
    }
}