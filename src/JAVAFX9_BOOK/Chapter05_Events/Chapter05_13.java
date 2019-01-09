package JAVAFX9_BOOK.Chapter05_Events;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// zdarzenie myszy - klikanie
public class Chapter05_13 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label(
                    "Naciśnij i zwolnij klawisz myszy nad kwadratem");
            Rectangle rect = new Rectangle(50, 50, 100, 60);
            rect.setFill(Color.BLUE);
            EventHandler<MouseEvent> mouseHandler = e -> System.out.println(
                    "Zaszło zdarzenie: " + e.getEventType().getName());
            rect.addEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler);
            rect.addEventHandler(MouseEvent.MOUSE_RELEASED, mouseHandler);
            rect.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            Circle circle = new Circle(250, 80, 30);
            circle.setFill(Color.RED);
            Pane root = new Pane();
            root.getChildren().addAll(label, rect, circle);
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia myszy");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}