package JAVAFX9_BOOK.Chapter05_Events;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// przebieg obsługi zdarzeń na przykładzie

public class Chapter05_03 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
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
            EventHandler<MouseEvent> mouseHandler = e -> {
                System.out.print("Handler: ");
                IPrint.printShort(e);
            };
            EventHandler<MouseEvent> mouseFilter = e -> {
                System.out.print("Filter: ");
                IPrint.printShort(e);
            };
            stage.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseFilter);
            scene.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseFilter);
            root.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseFilter);
            rect.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseFilter);
            circle.addEventFilter(MouseEvent.MOUSE_CLICKED, mouseFilter);
            stage.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            scene.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            root.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            rect.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
