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

public class Chapter05_18 extends Application {
    private double newX, newY, oldX, oldY, offx, offy;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label("Spróbuj przeciągnąć prostokąt");
            Rectangle rect = new Rectangle(50, 50, 100, 60);
            oldX = rect.getX(); // początkowa wsp X prostokąta
            oldY = rect.getY(); // poczatkow współrzedna Y prostokąta
            rect.setFill(Color.BLUE);
            EventHandler<MouseEvent> mouseHandler1 = e -> {
                offx = rect.getX() - e.getX(); // odległość miejsca klikniecia od brzegu prostokata os x
                offy = rect.getY() - e.getY(); // odległość miejsca klikniecia od brzegu prostokata os y
                // wyliczmy odległość od lewego górneg onarzożnika prostokąta (z niego zaczyna się rysowanie)
                // ponieważ odejmujemy wartości w obrębie prostokąta, i odejmujemy e, wartość będzie zawsze <=0
                // (wsp e.x i e.y będą na prawo i w dół czyli większe niż wsp narożnika
                System.out.println("klik");
            };


            EventHandler<MouseEvent> mouseHandler2 = e -> {
                newX = e.getX() + offx; // nowy x to nowa pozycja myszki x ale skorygowana o offset (odległość do narożnika)
                newY = e.getY() + offy; // nowy y to nowa pozycja myszki y ale skorygowana o offset (odległość do narożnika)
                System.out.println("oldx=" + oldX + "; oldY=" + oldY + "- newX=" + newX + "; newY=" + newY);
                double x = Math.min(oldX, newX); // najpierw ustawiamy mniejszą z wartości ? kod w sumie nie pootrzebny
                double y = Math.min(oldY, newY); // najpierw ustawiamy mniejszą z wartości ? kod w sumie nie pootrzebny
                rect.setX(x);
                rect.setY(y);
                oldX = newX;
                oldY = newY;
            };
            rect.addEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler1); // zdarzenie nacisniecia przycisku
            rect.addEventHandler(MouseEvent.MOUSE_DRAGGED, mouseHandler2); // zdarzenie przesuwania myszy z wcisnietym przyciskiem
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
