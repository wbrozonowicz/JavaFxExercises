package JAVAFX9_BOOK.Chapter08_2dShapes;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Chapter08_14 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {

            Arc arc3 = new Arc(380.0, 80.0, 60.0, 60.0, 0.0, 90.0);
            arc3.setType(ArcType.ROUND);
            arc3.setFill(Color.BURLYWOOD);
            Arc arc4 = new Arc(380.0, 80.0, 60.0, 60.0, 0.0, 90.0);
            arc4.setStroke(Color.BLACK);
            arc4.setType(ArcType.OPEN);
            arc4.setFill(Color.TRANSPARENT);
            Pane root = new Pane();
            root.getChildren().addAll(arc3, arc4);
            Scene scene = new Scene(root, 460, 280);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}