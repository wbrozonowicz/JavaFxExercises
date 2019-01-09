package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
// przykłąd hierarchii stage > scene > HBox > rec & circ
public class Chapter05_01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
try{
    Rectangle rec = new Rectangle(100,60);
    rec.setFill(Color.AQUAMARINE);
    Circle circ = new Circle(250, 80,30);
    circ.setFill(Color.BLUE);
    HBox root = new HBox();
    root.setSpacing(20);
    root.getChildren().addAll(rec,circ);
    Scene scene = new Scene(root, 410,200);
    primaryStage.setScene(scene);
    primaryStage.setTitle("Events");
    primaryStage.show();
} catch (Exception e){
    e.printStackTrace();
}
    }
}
