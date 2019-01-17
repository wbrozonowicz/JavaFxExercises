package JAVAFX9_BOOK.Chapter08_2dShapes;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

public class Chapter08_22 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Path path = new Path();
            int nPoints = 1000;
            double r1 = 60;
            double r2 = 50;
            double p = 70;
            double x1 = r1 + r2 - p;
            double y1 = 0.0;
            double x2;
            double y2;
            path.getElements().add(new MoveTo(x1, y1));
            for (int i = 0; i < nPoints; i++) {
                double t = i * Math.PI / 90;
                x2 = (r1 + r2) * Math.cos(t) - p * Math.cos((r1 + r2) * t / r2);
                y2 = (r1 + r2) * Math.sin(t) - p * Math.sin((r1 + r2) * t / r2);
                path.getElements().add(new LineTo(x2, y2));
            }
            path.setStroke(Color.AQUA);
            StackPane root = new StackPane();
            root.getChildren().add(path);
            Scene scene = new Scene(root, 500, 500);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
