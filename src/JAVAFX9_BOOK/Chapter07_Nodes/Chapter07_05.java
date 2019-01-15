package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// otoczki obiektów
public class Chapter07_05 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle circle = new Circle(80, 50, 30); // v i v1 to odleglości x i y od punktu 0,0 roota, v2 to promien
            circle.setFill(Color.GREEN);
            circle.setPickOnBounds(false); // otoczka koła jest kwadratem, metoda setPickOnBounds decyduje czy klikniecie na otoczke działa jak na samo kółko
            Bounds b = circle.getLayoutBounds();
            Rectangle ot1 = new Rectangle(b.getMinX(), b.getMinY(), b.getWidth(),
                    b.getHeight()); // rysujemy prostokąt o polozeniu i wymiarach otoczki
            ot1.setFill(Color.TRANSPARENT);
            ot1.setStroke(Color.RED);
            Rectangle rect = new Rectangle(200, 70, 100, 60); // v to odleglosc od 0 roota w osi x, v1 to odleglosc w osi y od 0 roota, v2 i v3 to wymiary prostokata
            rect.setFill(Color.BLUE);
            Bounds c = rect.getLayoutBounds();
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