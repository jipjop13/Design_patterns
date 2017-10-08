public class Stereo implements ElectronicDevice {

    private int volume = 0;

    @Override
    public void on() {
        System.out.println("Stereo is on");
    }

    @Override
    public void off() {
        System.out.println("Stereo is off");
    }

    @Override
    public void volumeUp() {
        volume++;

        System.out.println("Stereo Volume is at: " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;

        System.out.println("Stereo Volume is at: " + volume);
    }
}
