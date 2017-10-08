import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import observer.AAPLObserver;
import observer.IBMObserver;
import observer.TSLAObserver;
import stock.GetTheStock;
import stock.StockGrabber;
import view.GraphView;
import view.TextView;
import view.View;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create Views
        GridPane textView = new TextView();
        GridPane graphView = new GraphView();

        //Create necessary objects
        StockGrabber ibmGrabber = new StockGrabber();
        StockGrabber tslaGrabber = new StockGrabber();
        StockGrabber aaplGrabber = new StockGrabber();

        IBMObserver ibmObserver = new IBMObserver(ibmGrabber);
        ibmObserver.addView((View) textView);
        ibmObserver.addView((View) graphView);

        TSLAObserver tslaObserver = new TSLAObserver(tslaGrabber);
        tslaObserver.addView((View) textView);
        tslaObserver.addView((View) graphView);

        AAPLObserver aaplObserver = new AAPLObserver(aaplGrabber);
        aaplObserver.addView((View) textView);
        aaplObserver.addView((View) graphView);

        new Thread(new GetTheStock(ibmGrabber, "IBM", 200)).start();
        new Thread(new GetTheStock(tslaGrabber, "TSLA", 220)).start();
        new Thread(new GetTheStock(aaplGrabber, "AAPL", 250)).start();

        //Create tabs
        TabPane root = new TabPane();

        Tab textViewTab = new Tab();
        textViewTab.setText("Text");
        textViewTab.setContent(textView);

        Tab graphViewTab = new Tab();
        graphViewTab.setText("Grafiek");
        graphViewTab.setContent(graphView);

        root.getTabs().addAll(textViewTab, graphViewTab);

        primaryStage.setTitle("DP Week 1 - Stock Exchange");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
