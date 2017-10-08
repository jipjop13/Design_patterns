package stock;

import observer.Subject;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class GetTheStock implements Runnable {
    private Subject stockGrabber;
    private String stockName;
    private double stockPrice;

    private boolean isRunning;

    public GetTheStock(Subject stockGrabber, String stockName, double stockPrice) {
        this.stockGrabber = stockGrabber;
        this.stockName = stockName;
        this.stockPrice = stockPrice;

        this.isRunning = true;
    }

    @Override
    public void run() {
        while(isRunning) {
            try {
                //Generate new price and delay 2 seconds
                double randNum = (Math.random() - 0.05);
                this.stockPrice = this.stockPrice + randNum;
                DecimalFormat df = new DecimalFormat("#.##");
                DecimalFormatSymbols dfs = new DecimalFormatSymbols();
                dfs.setDecimalSeparator('.');
                df.setDecimalFormatSymbols(dfs);

                this.stockPrice = Double.valueOf(df.format(this.stockPrice));

                this.stockGrabber.notifyObservers(this.stockPrice);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
