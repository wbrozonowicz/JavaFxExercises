package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.stage.Stage;

public class Chapter08_19 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            CubicCurve qc = new CubicCurve(10.0, 150.0, 150.0, 140.0, 125.0,
                    50.0, 20.0, 20.0);
            qc.setStroke(Color.BLUE);
            qc.setFill(Color.GREEN);
            Pane root = new Pane();
            root.getChildren().add(qc);
            Scene scene = new Scene(root, 200, 200);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
