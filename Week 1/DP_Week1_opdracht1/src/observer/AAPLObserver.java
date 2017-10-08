package observer;

import view.View;

import java.util.ArrayList;
import java.util.List;

public class AAPLObserver implements Observer {
    private Subject stockGrabber;
    private double aaplPrice;

    private List<View> viewList;

    public AAPLObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);

        this.aaplPrice = 0.0;
        this.viewList = new ArrayList<>();
    }

    public void addView(View view) {
        this.viewList.add(view);
    }

    @Override
    public void update(double stockPrice) {
        this.aaplPrice = stockPrice;
        System.out.println(this.aaplPrice);

        for(View v : viewList) {
            v.update(this, stockPrice);
        }
    }
}
