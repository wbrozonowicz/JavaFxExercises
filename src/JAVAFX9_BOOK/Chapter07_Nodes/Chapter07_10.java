package JAVAFX9_BOOK.Chapter07_Nodes;


import javafx.application.Application;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// nakładające się węzły - sprawdzanie ich zależności wymaga pobrania ich Bounds
public class Chapter07_10 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle green = new Circle(80, 50, 30);
            green.setFill(Color.GREEN);
            Bounds greenb = green.getBoundsInLocal();
            Circle brown = new Circle(90, 100, 30);
            brown.setFill(Color.BROWN);
            Bounds brownb = brown.getBoundsInLocal();
            Rectangle blue = new Rectangle(50, 70, 120, 80);
            blue.setFill(Color.BLUE);
            blue.setRotate(30);
            Bounds blueb = blue.getBoundsInLocal();
            System.out.println(
                    "Czy blue zawiera brown?: " + blueb.contains(brownb));
            System.out.println(
                    "Czy blue zawiera green?: " + blueb.contains(greenb));
            System.out.println("Czy blue ma wspólne punkty z brown?: "
                    + blueb.intersects(brownb));
            System.out.println("Czy blue ma wspólne punkty z green?: "
                    + blueb.intersects(greenb));
            System.out.println("Czy brown ma wspólne punkty z green?: "
                    + brownb.intersects(greenb));
            Pane root = new Pane();
            root.getChildren().addAll(green, blue, brown);
            Scene scene = new Scene(root, 230, 200);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
