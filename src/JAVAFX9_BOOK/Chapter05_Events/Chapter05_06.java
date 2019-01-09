package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// uruchomienie zdarzenia następuje tylko tam gdzie mamy dodaną konsumpcję (tutaj: rect)
// wszystkie kontrolki typu buuton mają domyślnie dodaną konsumpcję
// można ją wyłączyć dodając własny uchwyt
// dla obiektóœ pozostałych trzeba dodać handler lub filter z metoda consume

public class Chapter05_06 extends Application {
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
            Button butti = new Button("Przycisk");
            root.getChildren().addAll(rect, circle,butti);
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
            stage.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            scene.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            root.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            rect.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler1);
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            butti.addEventHandler(MouseEvent.MOUSE_CLICKED,mouseHandler);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
