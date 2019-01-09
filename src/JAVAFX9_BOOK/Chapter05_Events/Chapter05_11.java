package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


// zdarzenia okna - metody skrótowe
public class Chapter05_11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Rectangle rect = new Rectangle(100, 60);
            rect.setFill(Color.AQUAMARINE);
            Circle circle = new Circle(250, 80, 30);
            circle.setFill(Color.BLUE);
            HBox root = new HBox();
            root.setSpacing(20);
            root.getChildren().addAll(rect, circle);
            Scene scene = new Scene(root, 410, 200);
            EventHandler<WindowEvent> windowHandler = e -> {
                System.out.print("Handler: ");
                IPrint.printShort(e);
            };
            stage.setOnShowing(windowHandler);
            stage.setOnShown(windowHandler);
            stage.setOnHiding(windowHandler);
            stage.setOnHidden(windowHandler);
            stage.setOnCloseRequest(windowHandler);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia okna");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
