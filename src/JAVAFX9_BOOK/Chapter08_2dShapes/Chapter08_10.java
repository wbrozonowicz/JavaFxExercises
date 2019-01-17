package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

// elipsa
public class Chapter08_10 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Pane root = new Pane();
            Ellipse eli1 = new Ellipse(80, 80, 40, 30); // (wsp x środka, wsp y środka, promień poziomy, promień pionowy)
            eli1.setFill(Color.YELLOW);
            eli1.setStroke(Color.BLACK);

            Ellipse eli2 = new Ellipse(80, 180, 40, 30); // (wsp x środka, wsp y środka, promień poziomy, promień pionowy)
            eli2.setFill(Color.TRANSPARENT);
            eli2.setStroke(Color.BLACK);
            Scene scene = new Scene(root, 400, 400);
            root.getChildren().addAll(eli1, eli2);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
