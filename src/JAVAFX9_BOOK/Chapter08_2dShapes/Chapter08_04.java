package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

// rysowanie linii przerywanej
public class Chapter08_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Line line = new Line(10, 10, 290, 10);
            line.setStroke(Color.BROWN);
            line.setStrokeWidth(3);
            line.getStrokeDashArray().addAll(20.0, 15.0, 10.0, 5.0); // konfuguracja linii przerywanej - powtarzajacy się cykl punktów linii (długości)
            root.getChildren().addAll(line);
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
