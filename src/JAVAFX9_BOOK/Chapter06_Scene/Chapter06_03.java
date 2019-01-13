package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.net.URL;

public class Chapter06_03 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle circle = new Circle(50, 50, 30);
            circle.setFill(Color.BLUE);
            HBox root = new HBox();
            root.setSpacing(20);
            root.getChildren().add(circle);
            Scene scene = new Scene(root, 410, 200);
            URL url = getClass().getResource("ryc06_18.png");
            // plik musi buć w OUT/PRODUCTION/...
            System.out.println(url.toString());
            Cursor c = Cursor.cursor(url.toString());
            scene.setCursor(c);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}