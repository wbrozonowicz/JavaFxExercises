package JAVAFX9_BOOK.Chapter08_2dShapes;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class Chapter08_12 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Arc arc1 = new Arc(80.0, 80.0, 60.0, 60.0, 0.0, 90.0);
            arc1.setType(ArcType.CHORD);
            arc1.setFill(Color.BURLYWOOD);
            arc1.setStroke(Color.BLACK);
            Arc arc2 = new Arc(230.0, 80.0, 60.0, 60.0, 0.0, 90.0);
            arc2.setType(ArcType.OPEN);
            arc2.setFill(Color.BURLYWOOD);
            arc2.setStroke(Color.BLACK);
            Arc arc3 = new Arc(380.0, 80.0, 60.0, 60.0, 0.0, 90.0);
            arc3.setType(ArcType.ROUND);
            arc3.setFill(Color.BURLYWOOD);
            arc3.setStroke(Color.BLACK);
            Arc arc4 = new Arc(80.0, 180.0, 60.0, 60.0, 90.0, 270.0);
            arc4.setType(ArcType.CHORD);
            arc4.setFill(Color.BURLYWOOD);
            arc4.setStroke(Color.BLACK);
            Arc arc5 = new Arc(230.0, 180.0, 60.0, 60.0, 90.0, 270.0);
            arc5.setType(ArcType.OPEN);
            arc5.setFill(Color.BURLYWOOD);
            arc5.setStroke(Color.BLACK);
            Arc arc6 = new Arc(380.0, 180.0, 60.0, 60.0, 90.0, 270.0);
            arc6.setType(ArcType.ROUND);
            arc6.setFill(Color.BURLYWOOD);
            arc6.setStroke(Color.BLACK);
            Pane root = new Pane();
            root.getChildren().addAll(arc1, arc2, arc3, arc4, arc5, arc6);
            Scene scene = new Scene(root, 460, 280);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
