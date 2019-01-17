package JAVAFX9_BOOK.Chapter08_2dShapes;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.FillRule;
import javafx.scene.shape.SVGPath;
import javafx.stage.Stage;

public class Chapter08_23 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            SVGPath path = new SVGPath();
            path.setContent(
                    "M0,200 Q200,400,400,200 Q200,0,0,200 M100,250 L100,150 "
                            + "L300,250 L300,150 Z");
            path.setStroke(Color.BLACK);
            path.setFill(Color.AQUAMARINE);
            path.setFillRule(FillRule.EVEN_ODD);
            StackPane root = new StackPane();
            root.getChildren().add(path);
            Scene scene = new Scene(root, 500, 300);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}