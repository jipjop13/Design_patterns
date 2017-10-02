package observer;

public class AAPLObserver implements Observer {
    private Subject stockGrabber;
    private double aaplPrice;

    public AAPLObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);
        this.aaplPrice = 0.0;
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    @Override
    public void update(double stockPrice) {
        this.aaplPrice = stockPrice;
        System.out.println(this.aaplPrice);
    }
}
