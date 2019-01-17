package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.print.Collation;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

// odejmowanie dwóch kształtów
public class Chapter08_01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Circle c1 = new Circle(100, 100, 50);
            c1.setFill(Color.BLUE);
            Circle c2 = new Circle(150, 100, 30);
            c2.setFill(Color.ORANGE);
            Shape shape = Shape.subtract(c1, c2);

            VBox root = new VBox();
            Scene scene = new Scene(root, 400, 400);
            root.getChildren().addAll(shape);


            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
