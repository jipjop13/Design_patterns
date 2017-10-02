package observer;

public class TSLAObserver implements Observer {
    private Subject stockGrabber;
    private double tslaPrice;

    public TSLAObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);
        this.tslaPrice = 0.0;
    }

    public double getTslaPrice() {
        return tslaPrice;
    }

    @Override
    public void update(double stockPrice) {
        this.tslaPrice = stockPrice;
        System.out.println(this.tslaPrice);
    }
}
