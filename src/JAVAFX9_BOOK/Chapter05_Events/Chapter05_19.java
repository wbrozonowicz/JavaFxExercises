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

import java.time.Duration;
import java.time.Instant;

// informacje o przeciąganiu
public class Chapter05_19 extends Application {
    private static int counter = 0;
    private static Instant startTime = Instant.now();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label("Spróbuj przeciągnąć prostokąt");
            Rectangle rect = new Rectangle(50, 50, 100, 60);
            rect.setFill(Color.BLUE);
            EventHandler<MouseEvent> mouseHandler = e -> {
                Instant endTime = Instant.now();
                long time = Duration.between(startTime, endTime).toMillis();
                startTime = endTime;
                counter++;
                System.out.println("Zdarzenie: " + e.getEventType().getName()
                        + " zaszło po raz " + counter + " po " + time
                        + " ms od poprzedniego zdarzenia");
            };
            rect.addEventHandler(MouseEvent.MOUSE_DRAGGED, mouseHandler);
            rect.addEventHandler(MouseEvent.DRAG_DETECTED, mouseHandler);
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
