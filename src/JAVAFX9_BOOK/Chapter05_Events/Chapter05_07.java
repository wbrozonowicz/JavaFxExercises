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


// metody skrótowe przykłąd - istnieją tylko dla handlerów, dla filtrów nie istnieją!!!s
public class Chapter05_07 extends Application {
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
            EventHandler<MouseEvent> mouseHandler1 = e -> {
                System.out.print("Handler: ");
                e.consume();
                IPrint.printShort(e);
            };
            stage.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);  // skrótowa metoda nie istniej dla stage - tu trzeba użyć metodę rozrzerzoną
            scene.setOnMouseClicked(mouseHandler); // skrótowa metoda
            root.setOnMouseClicked(mouseHandler);// skrótowa metoda
            rect.setOnMouseClicked(mouseHandler1);// skrótowa metoda
            circle.setOnMouseClicked(mouseHandler);// skrótowa metoda
            stage.setScene(scene);
            stage.setTitle("Zdarzenia");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}