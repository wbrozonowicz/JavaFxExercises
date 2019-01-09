package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import javafx.event.EventHandler;


// zdarzenia dotyczące okna

public class Chapter05_08 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Rectangle rec = new Rectangle(100, 60);
            rec.setFill(Color.AQUAMARINE);
            Circle circ = new Circle(250, 80, 30);
            circ.setFill(Color.BLUE);
            HBox root = new HBox();
            root.setSpacing(20);
            root.getChildren().addAll(rec, circ);
            Scene scene = new Scene(root, 410, 200);
            EventHandler<WindowEvent> windowFilter = e -> {
                System.out.println("Filter: ");
                IPrint.printShort(e);
            };
            EventHandler<WindowEvent> windowHandler = e -> {
                System.out.println("Handler:");
                IPrint.printShort(e);
            };
            primaryStage.addEventFilter(WindowEvent.WINDOW_SHOWING, windowFilter);
            primaryStage.addEventFilter(WindowEvent.WINDOW_SHOWN, windowFilter);
            primaryStage.addEventFilter(WindowEvent.WINDOW_HIDING, windowFilter);
            primaryStage.addEventFilter(WindowEvent.WINDOW_HIDDEN, windowFilter);
            primaryStage.addEventFilter(WindowEvent.WINDOW_CLOSE_REQUEST, windowFilter);

            primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWING, windowHandler);
            primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWN, windowHandler);
            primaryStage.addEventHandler(WindowEvent.WINDOW_HIDING, windowHandler);
            primaryStage.addEventHandler(WindowEvent.WINDOW_HIDDEN, windowHandler);
            primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, windowHandler);

            primaryStage.setScene(scene);
            primaryStage.setTitle("Zdarzenia okna");
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
