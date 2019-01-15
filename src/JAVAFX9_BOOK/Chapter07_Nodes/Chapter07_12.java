package JAVAFX9_BOOK.Chapter07_Nodes;


import javafx.application.Application;
import javafx.scene.CacheHint;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
// przykłąd wezła buforowaneoo (użyteczne do bardziej skomplikowanych animacji)
public class Chapter07_12 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle green = new Circle(80, 50, 30);
            green.setFill(Color.GREEN);
            Circle brown = new Circle(90, 100, 30);
            brown.setFill(Color.BROWN);
            Rectangle blue = new Rectangle(50, 70, 120, 80);
            blue.setFill(Color.BLUE);
            blue.setRotate(30);
            blue.setCache(true);
            blue.setCacheHint(CacheHint.ROTATE); // metoda setCacheHint do buforowania
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
