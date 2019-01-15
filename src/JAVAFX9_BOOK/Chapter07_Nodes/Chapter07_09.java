package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// nody które są rozszerzalne - ich wymiar określa sma kontener
// można tym sterować metodami setPrefSize i setMinSize oraz setMaxSize
// po narzuceniu takich wymiarówprzycisk będzi etraktowany jak nierozszerzalny
public class Chapter07_09 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle circle = new Circle(80, 50, 30);
            circle.setFill(Color.GREEN);
            System.out.println(
                    "Kółko jest rozszerzalne?: " + circle.isResizable());
            Rectangle rect = new Rectangle(200, 70, 100, 60);
            rect.setFill(Color.BLUE);
            rect.setRotate(30);
            Button but = new Button("Przycisk");
            but.setLayoutX(10);
            but.setLayoutY(130);
            but.setPrefSize(50, 130); // konfiguracja rozmiarów buttona
            but.setMinSize(50, 130);
            but.setMaxSize(50, 130);
            System.out.println(
                    "Przycisk jest rozszerzalny?: " + but.isResizable());
            Pane root = new Pane();
            root.getChildren().addAll(but, circle, rect);
            Scene scene = new Scene(root, 360, 200);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}