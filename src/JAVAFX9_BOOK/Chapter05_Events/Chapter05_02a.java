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


// ćwiczenie z obsługą kliknięć myszką na elemencie graficznym - prostokąt i okrąg
public class Chapter05_02a extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Rectangle rect = new Rectangle(100, 60);
            rect.setFill(Color.BLUE);
            Circle circle = new Circle(250, 80, 30);
            circle.setFill(Color.BLUE);
            HBox root = new HBox();
            root.setSpacing(20);
            root.getChildren().addAll(rect, circle);
            Scene scene = new Scene(root, 410, 200);

// poniżej to samo ale z lambdą
            EventHandler<MouseEvent> mouseHandler = e -> {
                Rectangle  sourceRec = (Rectangle) e.getSource();
                double maxH = root.getHeight();
                double maxW = root.getWidth();
                    double a =sourceRec.getHeight();
                    double b =sourceRec.getWidth();
                    if ((1.1*a)>maxH || (1.1*b)>maxW) {
                        sourceRec.setFill(Color.GREEN);
                    } else if ((1.1*a)<(0.2*maxH) || (1.1*b)<(0.2*maxW)){
                        sourceRec.setFill(Color.BLUE);
                    }
                    if(sourceRec.getFill()==Color.BLUE) {
                        sourceRec.setHeight(1.1 * a);
                        sourceRec.setWidth(1.1 * b);
                    } else {
                        sourceRec.setHeight(0.9 * a);
                        sourceRec.setWidth(0.9 * b);
                    }
            };

            EventHandler<MouseEvent> mouseHandler1 = e -> {
                Circle  sourceCir = (Circle) e.getSource();
                double maxH = root.getHeight();
                double maxW = root.getWidth();
                double r =sourceCir.getRadius();
                if ((1.1*r*2)>maxH || (1.1*r*2)>maxW) {
                    sourceCir.setFill(Color.GREEN);
                } else if ((1.1*2*r)<(0.2*maxH) || (1.1*2*r)<(0.2*maxW)){
                    sourceCir.setFill(Color.BLUE);
                }
                if(sourceCir.getFill()==Color.BLUE) {
                    sourceCir.setRadius(1.1 * r);
                    sourceCir.setRadius(1.1 * r);
                } else {
                    sourceCir.setRadius(0.9 * r);
                    sourceCir.setRadius(0.9 * r);
                }
            };

            rect.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler); // wyzwalane na kliknięcie
            circle.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler1);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
