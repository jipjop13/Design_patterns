package view;

import javafx.geometry.Pos;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import observer.AAPLObserver;
import observer.IBMObserver;
import observer.Observer;
import observer.TSLAObserver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class GraphView extends GridPane implements View {
    private LineChart<String, Number> lineChart;
    private XYChart.Series ibmData;
    private XYChart.Series tslaData;
    private XYChart.Series aaplData;

    public GraphView() {
        this.setAlignment(Pos.CENTER);
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Tijd");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Prijs");

        ibmData = new XYChart.Series();
        ibmData.setName("IBM");

        tslaData = new XYChart.Series();
        tslaData.setName("TSLA");

        aaplData = new XYChart.Series();
        aaplData.setName("AAPL");

        lineChart = new LineChart<String, Number>(xAxis, yAxis);

        lineChart.getData().addAll(ibmData, tslaData, aaplData);

        this.add(lineChart, 0, 0);
    }

    @Override
    public synchronized void update(Observer o, double price) {
        String timeStamp = new SimpleDateFormat("HH.mm.ss").format(new Date());

        if(o instanceof IBMObserver) {
            ibmData.getData().add(new XYChart.Data(timeStamp, price));

        } else if(o instanceof TSLAObserver) {
            tslaData.getData().add(new XYChart.Data(timeStamp, price));

        } else if(o instanceof AAPLObserver) {
            aaplData.getData().add(new XYChart.Data(timeStamp, price));

        }
    }
}
