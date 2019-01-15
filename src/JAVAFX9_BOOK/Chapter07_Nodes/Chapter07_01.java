package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// nadawanie id do Node'a
public class Chapter07_01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    try{
        Circle circ = new Circle(80,50,30);
        circ.setFill(Color.RED);
        Circle circ1 = new Circle(350, 80,30);
        circ1.setFill(Color.GREEN);
        circ1.setId("kolko");
        Rectangle rect = new Rectangle(50,250,100,60);
        rect.setFill(Color.BLUE);
        Pane root = new Pane();
        Pane root1 = new Pane();
        root1.setBorder(new Border(new BorderStroke(Color.AQUA, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
        root1.getChildren().addAll(circ,rect);
        root1.setLayoutX(0);
        root1.setLayoutY(0);
        root1.setMinWidth(200);
        root1.setMinHeight(200);
        Pane root2 = new Pane();
        root2.setBorder(new Border(
                new BorderStroke(Color.RED, BorderStrokeStyle.SOLID,
                        CornerRadii.EMPTY, BorderWidths.DEFAULT)));
    root2.getChildren().addAll(circ1);
    root2.setLayoutX(220);
    root2.setLayoutY(0);
    root2.setMinWidth(150);
    root.getChildren().addAll(root1,root2);
        Scene scene = new Scene(root, 600,400);
        primaryStage.setScene(scene);
        primaryStage.show();
        System.out.println(root.lookup("#kolko")); // metoda lookup musi być wywołana po show - inaczej zróci NULLpointerException
        Circle c = (Circle) root.lookup("#kolko");
        c.setFill(Color.BLUE);
    } catch (Exception e){
        e.printStackTrace();
    }
    }
}
