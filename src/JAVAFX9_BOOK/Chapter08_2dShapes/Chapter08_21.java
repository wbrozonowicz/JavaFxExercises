package JAVAFX9_BOOK.Chapter08_2dShapes;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class Chapter08_21 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            double x = 20;
            double y = 20;
            double w = 200;
            double h = 200;
            double x0 = x + 0.5 * w;
            double y0 = y + 0.3 * h;
            double x1 = x + 0.1 * w;
            double y2 = y + 0.6 * h;
            double x3 = x + 0.5 * w;
            double y3 = y + 0.9 * h;
            double x4 = x + w;
            double y4 = y + 0.6 * h;
            double x5 = x + 0.9 * w;
            Path path = new Path();
            path.getElements().add(new MoveTo(x0, y0));
            path.getElements().add(new CubicCurveTo(x1, y, x, y2, x3, y3));
            path.getElements().add(new CubicCurveTo(x4, y4, x5, y, x0, y0));
            path.setStroke(Color.WHITE);
            path.setFill(Color.RED);
            System.out.println(path);
            Pane root = new Pane();
            root.getChildren().add(path);
            Scene scene = new Scene(root, 250, 250);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
