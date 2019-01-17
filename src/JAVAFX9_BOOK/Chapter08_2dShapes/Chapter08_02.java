package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

// tworzenie kształtu przez dodawanie dwóch kształtów
public class Chapter08_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Circle c1 = new Circle(100, 100, 50);
            c1.setFill(Color.BLUE);
            Circle c2 = new Circle(150, 100, 30);
            c2.setFill(Color.ORANGE);
            Shape shape = Shape.union(c1, c2);
            root.getChildren().addAll(shape);
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
