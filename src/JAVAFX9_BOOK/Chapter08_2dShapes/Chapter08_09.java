package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


// circle
public class Chapter08_09 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Circle circ = new Circle(80, 80, 40); // (wsp x środka, wsp y środka, promień)
            circ.setFill(Color.BLUE);
            circ.setStroke(Color.RED);
            Circle circ2 = new Circle(180, 80, 40); // (wsp x środka, wsp y środka, promień)
            circ2.setFill(Color.TRANSPARENT);
            circ2.setStroke(Color.FIREBRICK);
            Pane root = new Pane();
            root.getChildren().addAll(circ, circ2);
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
