package observer;

import view.View;

import java.util.ArrayList;
import java.util.List;

public class TSLAObserver implements Observer {
    private Subject stockGrabber;
    private double tslaPrice;

    private List<View> viewList;

    public TSLAObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);

        this.tslaPrice = 0.0;
        this.viewList = new ArrayList<>();
    }

    public void addView(View view) {
        this.viewList.add(view);
    }

    @Override
    public void update(double stockPrice) {
        this.tslaPrice = stockPrice;
        System.out.println(this.tslaPrice);

        for(View v : viewList) {
            v.update(this, stockPrice);
        }
    }
}
