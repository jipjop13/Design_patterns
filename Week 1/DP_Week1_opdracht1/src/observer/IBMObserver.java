package observer;

import view.View;

import java.util.ArrayList;
import java.util.List;

public class IBMObserver implements Observer {
    private Subject stockGrabber;
    private double ibmPrice;

    private List<View> viewList;

    public IBMObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.stockGrabber.registerObserver(this);

        this.viewList = new ArrayList<View>();
        this.ibmPrice = 0.0;
    }

    public void addView(View view) {
        this.viewList.add(view);
    }

    @Override
    public void update(double stockPrice) {
        this.ibmPrice = stockPrice;
        System.out.println(this.ibmPrice);

        for(View v : viewList) {
            v.update(this, stockPrice);
        }
    }
}
