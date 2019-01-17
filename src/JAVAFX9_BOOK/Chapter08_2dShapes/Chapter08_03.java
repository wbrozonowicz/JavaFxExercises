package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

// tworzenie linii
public class Chapter08_03 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Line line1 = new Line();
            line1.setStartX(10);
            line1.setStartY(10);
            line1.setEndX(100);
            line1.setEndY(10);
            line1.setStroke(Color.BROWN);
            line1.setStrokeWidth(3);
            //Line line2 = new Line(10, 10, 100, 10);
            Pane root = new Pane();
            root.getChildren().addAll(line1);
            Scene scene = new Scene(root, 200, 50);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}