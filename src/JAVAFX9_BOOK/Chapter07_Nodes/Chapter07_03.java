package JAVAFX9_BOOK.Chapter07_Nodes;



import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// współrzędne na scenie
public class Chapter07_03 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle circle1 = new Circle(80, 50, 30);
            circle1.setFill(Color.RED);
            Circle circle3 = new Circle(280, 80, 30);
            circle3.setFill(Color.GREEN);
            Rectangle rect = new Rectangle(50, 250, 100, 60);
            rect.setFill(Color.BLUE);
            Line line1 = new Line();
            line1.setStartX(80f);
            line1.setStartY(45f);
            line1.setEndX(80f);
            line1.setEndY(55f);
            Line line2 = new Line();
            line2.setStartX(75f);
            line2.setStartY(50f);
            line2.setEndX(85f);
            line2.setEndY(50f);
            //-
            Line line3 = new Line();
            line3.setStartX(280f);
            line3.setStartY(75f);
            line3.setEndX(280f);
            line3.setEndY(85f);
            Line line4 = new Line();
            line4.setStartX(275f);
            line4.setStartY(80f);
            line4.setEndX(285f);
            line4.setEndY(80f);
            //-
            Line line5 = new Line();
            line5.setStartX(45f);
            line5.setStartY(250f);
            line5.setEndX(55f);
            line5.setEndY(250f);
            Line line6 = new Line();
            line6.setStartX(50f);
            line6.setStartY(245f);
            line6.setEndX(50f);
            line6.setEndY(255f);
            Text t1 = new Text(80, 95, "1");
            Text t2 = new Text(50, 325, "2");
            Text t3 = new Text(280, 125, "3");
            Pane root = new Pane();
            Pane root1 = new Pane();
            root1.setBorder(new Border(new BorderStroke(Color.AQUA, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            root1.getChildren().addAll(circle1, rect, line1, line2, line5, line6, t1, t2);
            Pane root2 = new Pane();
            root2.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            root2.getChildren().addAll(circle3, line3, line4, t3);
            root.getChildren().addAll(root1, root2);
            Scene scene = new Scene(root, 560, 350);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
