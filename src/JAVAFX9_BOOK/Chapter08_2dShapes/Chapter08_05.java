package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.awt.*;

// linia łamana otwarta {polilinia]
public class Chapter08_05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Polyline poli = new Polyline();
            poli.getPoints().addAll(10.0, 10.0, 50.0, 50.0, 50.0, 200.0, 200.0, 50.0, 30.0, 10.0); // kolejne liczby to pary współrzędnych kolejnych punktów polilinii
            poli.setStroke(Color.DEEPPINK);
            root.getChildren().addAll(poli);
            Scene scene = new Scene(root, 333, 333);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
