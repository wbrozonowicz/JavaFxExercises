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

// zdarzenia myszy - nakierowanie i opuszczenie obiektu
public class Chapter05_17 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label("Umieść mysz nad kwadratem");
            Rectangle rect = new Rectangle(50, 50, 100, 60);
            rect.setFill(Color.BLUE);
            EventHandler<MouseEvent> mouseHandler = e -> {
                System.out.print("Handler: ");
                IPrint.printShort(e);
            };
            rect.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
            rect.addEventHandler(MouseEvent.MOUSE_EXITED, mouseHandler);
            Circle circle = new Circle(250, 80, 30);
            circle.setFill(Color.RED);
            Pane root = new Pane();
            root.getChildren().addAll(label, rect, circle);
            root.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
            root.addEventHandler(MouseEvent.MOUSE_EXITED, mouseHandler);
            Scene scene = new Scene(root, 600, 400);
            scene.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
            scene.addEventHandler(MouseEvent.MOUSE_EXITED, mouseHandler);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia myszy");
            stage.addEventHandler(MouseEvent.MOUSE_ENTERED, mouseHandler);
            stage.addEventHandler(MouseEvent.MOUSE_EXITED, mouseHandler);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}