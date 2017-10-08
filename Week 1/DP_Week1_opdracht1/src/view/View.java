package view;

import observer.Observer;

public interface View {
    public void update(Observer o, double price);
}
