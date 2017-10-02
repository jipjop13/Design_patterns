package observer;

import view.View;

public class TSLAObserver implements Observer {
    private Subject stockGrabber;
    private double tslaPrice;

    private View view;

    public TSLAObserver(Subject stockGrabber, View view) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);

        this.tslaPrice = 0.0;
        this.view = view;
    }

    public double getTslaPrice() {
        return tslaPrice;
    }

    @Override
    public void update(double stockPrice) {
        this.tslaPrice = stockPrice;
        System.out.println(this.tslaPrice);

        view.update(this, stockPrice);
    }
}
