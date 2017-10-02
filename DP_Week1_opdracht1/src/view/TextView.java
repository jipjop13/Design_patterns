package view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class TextView extends GridPane implements View {
    private Text ibmPriceText;
    private Text tslPriceText;
    private Text aaplPriceText;

    public TextView() {
        this.ibmPriceText = new Text();
        this.tslPriceText = new Text();
        this.aaplPriceText = new Text();

        this.setAlignment(Pos.CENTER);
        this.setHgap(10.0);
        this.setVgap(10.0);
        this.setPadding(new Insets(25, 25, 25, 25));

        this.add(new Label("IBM Price: "), 0, 0);
        this.add(ibmPriceText, 1, 0);

        this.add(new Label("TSLA Price:"), 0, 1);
        this.add(tslPriceText, 1, 1);

        this.add(new Label("AAPL Price:"), 0, 2);
        this.add(aaplPriceText, 1, 2);

    }

    @Override
    public void update() {

    }
}
