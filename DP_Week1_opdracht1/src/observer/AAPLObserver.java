package observer;

import view.View;

public class AAPLObserver implements Observer {
    private Subject stockGrabber;
    private double aaplPrice;

    private View view;

    public AAPLObserver(Subject stockGrabber, View view) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);

        this.aaplPrice = 0.0;
        this.view = view;
    }

    public double getAaplPrice() {
        return aaplPrice;
    }

    @Override
    public void update(double stockPrice) {
        this.aaplPrice = stockPrice;
        System.out.println(this.aaplPrice);

        view.update(this, stockPrice);
    }
}
