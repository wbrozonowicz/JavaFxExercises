package JAVAFX9_BOOK.Chapter07_Nodes;



import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// efekty specjalne obiektów
// efekty takie jak dropShadow wpływaja na rozmiary otoczki - włąsciwość boundsInLocal
public class Chapter07_06 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            DropShadow dropShadow = new DropShadow();
            dropShadow.setRadius(5.0);
            dropShadow.setOffsetX(5.0);
            dropShadow.setOffsetY(5.0);
            dropShadow.setColor(Color.ORANGE);
            Circle circle = new Circle(80, 50, 30);
            circle.setFill(Color.GREEN);
            circle.setEffect(dropShadow); // ustawianie efektu dla obiektu
            circle.setPickOnBounds(false);
            Bounds b = circle.getBoundsInLocal();
            Rectangle ot1 = new Rectangle(b.getMinX(), b.getMinY(), b.getWidth(),
                    b.getHeight());
            ot1.setFill(Color.TRANSPARENT);
            ot1.setStroke(Color.RED);
            Rectangle rect = new Rectangle(200, 70, 100, 60);
            rect.setFill(Color.BLUE);
            rect.setEffect(dropShadow);
            Bounds c = rect.getBoundsInLocal();
            Rectangle ot2 = new Rectangle(c.getMinX(), c.getMinY(), c.getWidth(),
                    c.getHeight());
            ot2.setFill(Color.TRANSPARENT);
            ot2.setStroke(Color.RED);
            EventHandler<MouseEvent> mouseHandler = e -> System.out.print("Moja otoczka nie przyjmuje kliknięć");
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            Pane root = new Pane();
            root.getChildren().addAll(ot1, circle, rect, ot2);
            Scene scene = new Scene(root, 360, 200);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
