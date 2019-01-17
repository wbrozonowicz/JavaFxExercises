package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;

import java.awt.*;
// poligon - od polilini różni się tym że sam automatycznie sie domyka

public class Chapter08_15 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Pane pane = new Pane();
            Polygon pligon = new Polygon(10.0, 10.0, 50.0, 50.0, 50.0, 200.0, 200.0, 50.0);
            pligon.setStroke(Color.DEEPPINK);
            pligon.setFill(Color.TRANSPARENT);
            Scene scene = new Scene(pane, 400, 400);
            pane.getChildren().add(pligon);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
