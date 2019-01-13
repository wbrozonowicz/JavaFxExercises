package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


// ustawianie kursora dla węzła
public class Chapter06_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            HBox root = new HBox();
            Circle circ = new Circle(50, 50, 30);
            circ.setFill(Color.BLUE);
            root.getChildren().add(circ);
            Scene scene = new Scene(root, 500, 500);
            scene.setCursor(Cursor.DEFAULT);
            EventHandler<MouseEvent> mouseHandler1 = e -> {
                circ.setCursor(Cursor.CLOSED_HAND);
                e.consume();
            };
            EventHandler<MouseEvent> mouseHandler2 = e -> {
                circ.setCursor(Cursor.NONE);
                e.consume();
            };
            circ.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler1);
            circ.addEventHandler(MouseEvent.MOUSE_EXITED, mouseHandler2);

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
