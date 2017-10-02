package observer;

import view.View;

public class IBMObserver implements Observer {
    private Subject stockGrabber;
    private double ibmPrice;

    private View view;

    public IBMObserver(Subject stockGrabber, View view) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);

        this.view = view;
        this.ibmPrice = 0.0;
    }

    public double getIbmPrice() {
        return this.ibmPrice;
    }

    @Override
    public void update(double stockPrice) {
        this.ibmPrice = stockPrice;
        System.out.println(this.ibmPrice);

        view.update(this, stockPrice);
    }
}
