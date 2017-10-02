import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import observer.AAPLObserver;
import observer.IBMObserver;
import observer.TSLAObserver;
import stock.GetTheStock;
import stock.StockGrabber;
import view.TextView;
import view.View;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Create Views
        GridPane test = new TextView();

        //Create necessary objects
        StockGrabber ibmGrabber = new StockGrabber();
        StockGrabber tslaGrabber = new StockGrabber();
        StockGrabber aaplGrabber = new StockGrabber();

        IBMObserver ibmObserver = new IBMObserver(ibmGrabber, (View) test);
        TSLAObserver tslaObserver = new TSLAObserver(tslaGrabber, (View) test);
        AAPLObserver aaplObserver = new AAPLObserver(aaplGrabber, (View) test);

        new Thread(new GetTheStock(ibmGrabber, "IBM", 200)).start();
        new Thread(new GetTheStock(tslaGrabber, "TSLA", 300)).start();
        new Thread(new GetTheStock(aaplGrabber, "AAPL", 500)).start();

        StackPane root = new StackPane();

        primaryStage.setTitle("DP Week 1 - Stock Exchange");
        primaryStage.setScene(new Scene(test, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
