package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// obiekt rectangle
public class Chapter08_08 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
    try{
        Pane root = new Pane();
        Rectangle rect = new Rectangle(30, 30, 100, 60); // (lewy grn róg x, lewy grn róg y, szer, wys)
        rect.setFill(Color.YELLOW);

        // prostokąt z zaokrąglonymi rogami
        Rectangle rect2 = new Rectangle(90,90,100,60);
        rect2.setFill(Color.PINK);
        rect2.setArcWidth(28);
        rect2.setArcHeight(28);

        // sam kontur prostokąta
        Rectangle rect3 = new Rectangle(200,200, 50,50);
        rect3.setStroke(Color.GREEN);
        rect3.setFill(Color.TRANSPARENT);
        // kontur z zaokrągleniami
        Rectangle rect4 = new Rectangle(10, 10, 330, 330);
        rect4.setFill(Color.TRANSPARENT);
        rect4.setStroke(Color.BROWN);


        Scene scene = new Scene(root,400,400);
        root.getChildren().addAll(rect, rect2, rect3, rect4);
        primaryStage.setScene(scene);
        primaryStage.show();
    } catch (Exception e){
        e.printStackTrace();
    }
    }
}
