package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.QuadCurve;
import javafx.stage.Stage;

// krzywa beziera
public class Chapter08_16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Pane root = new Pane();
            QuadCurve krzywa = new QuadCurve(10.0, 150.0, 150.0, 150.0, 125.0, 50.0); // wsp x, wsp y pktu poczatkowego, punktu kontrolnego i pktu koncowego

            Scene scene = new Scene(root, 400, 400);
            krzywa.setStroke(Color.BLUE);
            krzywa.setFill(Color.GREEN);

            // krzywa beziera bez wypełnienia
            QuadCurve krzywa2 = new QuadCurve(20.0, 350.0, 50.0, 50.0, 225.0, 58.0); // wsp x, wsp y pktu poczatkowego, punktu kontrolnego i pktu koncowego
            krzywa2.setFill(Color.TRANSPARENT);
            krzywa2.setStroke(Color.BROWN);
            root.getChildren().addAll(krzywa, krzywa2);
            primaryStage.setScene(scene);
            primaryStage.show();


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
