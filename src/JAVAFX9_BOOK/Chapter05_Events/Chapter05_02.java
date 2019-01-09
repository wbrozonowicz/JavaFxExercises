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


// aplikacja drukująca informacje o zdarzeniu
public class Chapter05_02 extends Application {
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
           // EventHandler<MouseEvent> mouseHandler = IPrint::print;  // za pomoca metody interfejsu IPrint

            // za pomocą klasy anonimowej
//            EventHandler<MouseEvent> mouseHandler = new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent e) {
//                    String typ = e.getEventType().getName();
//                    String source = e.getSource().getClass().getSimpleName();
//                    String target = e.getTarget().getClass().getSimpleName();
//                    double sx = e.getSceneX();
//                    double sy = e.getSceneY();
//                    double ex = e.getScreenX();
//                    double ey = e.getScreenY();
//                    System.out.println("Typ zdarzenia: " + typ + ", Źródło zdarzenia: "
//                            + source + ", Cel zdarzenia: " + target);
//                    System.out.println(
//                            "Koordynaty zdarzenia na scenie: [" + sx + ", " + sy + "]");
//                    System.out.println("Koordynaty zdarzenia na wyświetlaczu: [" + ex + ", "
//                            + ey + "]");
//                }
//            };
// poniżej to samo ale z lambdą
            EventHandler<MouseEvent> mouseHandler = e -> {
                String typ = e.getEventType().getName();
                String source = e.getSource().getClass().getSimpleName();
                String target = e.getTarget().getClass().getSimpleName();
                double sx = e.getSceneX();
                double sy = e.getSceneY();
                double ex = e.getScreenX();
                double ey = e.getScreenY();
                System.out.println("Typ zdarzenia: " + typ + ", Źródło zdarzenia: "
                        + source + ", Cel zdarzenia: " + target);
                System.out.println(
                        "Koordynaty zdarzenia na scenie: [" + sx + ", " + sy + "]");
                System.out.println("Koordynaty zdarzenia na wyświetlaczu: [" + ex + ", "
                        + ey + "]");
            };

            rect.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler); // wyzwalane na kliknięcie
            circle.addEventHandler(MouseEvent.MOUSE_MOVED,mouseHandler); // wyzwalana na ruch myszą
            stage.setScene(scene);
            stage.setTitle("Zdarzenia");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}