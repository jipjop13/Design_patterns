package stock;

import observer.Observer;
import observer.Subject;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    private List<Observer> observerList;

    public StockGrabber() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifyObservers(double stockPrice) {
        for(Observer observer : this.observerList) {
            observer.update(stockPrice);
        }
    }
}
