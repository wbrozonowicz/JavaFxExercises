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


// zdarzenia okna typu any - to samo co w listingu Chapter05_09 ale króßszym kodem
public class Chapter05_09 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Rectangle rec = new Rectangle(100, 60);
            rec.setFill(Color.YELLOW);
            Circle circ = new Circle(250, 80, 30);
            circ.setFill(Color.GHOSTWHITE);
            HBox root = new HBox();
            root.getChildren().addAll(rec, circ);
            Scene scene = new Scene(root, 400, 300);
            primaryStage.setScene(scene);
            EventHandler<WindowEvent> windowFilter = e -> {
                System.out.println("Filter");
                IPrint.printShort(e);
            };
            EventHandler<WindowEvent> windowHandler = e -> {
                System.out.println("Handler");
                IPrint.printShort(e);
            };
            primaryStage.addEventFilter(WindowEvent.ANY, windowFilter);
            primaryStage.addEventHandler(WindowEvent.ANY, windowHandler);


            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
