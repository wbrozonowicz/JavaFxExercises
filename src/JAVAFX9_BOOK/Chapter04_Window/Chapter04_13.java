package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// okna przesuwane do przodu i tyłu
public class Chapter04_13 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {

            Stage stage1 = new Stage();
            Stage stage2 = new Stage();


            VBox root = new VBox();
            Scene scene = new Scene(root, 500, 500);
            Button but = new Button("to back");
            but.setOnAction(e -> primaryStage.toBack());
            root.getChildren().add(but);

            Button buts2 = new Button("stage2 to front");
            Button buts3 = new Button("stage3 to front");
            buts2.setOnAction(e -> stage1.toFront());
            buts3.setOnAction(e -> stage2.toFront());
            root.getChildren().addAll(buts2, buts3);
            primaryStage.setTitle("okno1");
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.centerOnScreen();
            primaryStage.show();

            VBox root1 = new VBox();
            Scene scene1 = new Scene(root1, 400, 400);
            Button but1 = new Button("to back");
            but1.setOnAction(e -> stage1.toBack());
            root1.getChildren().add(but1);
            stage1.setTitle("okno2");
            stage1.setScene(scene1);
            stage1.sizeToScene();
            stage1.centerOnScreen();
            stage1.show();

            VBox root2 = new VBox();
            Scene scene2 = new Scene(root2, 300, 300);
            Button but2 = new Button("to back");
            but2.setOnAction(e -> stage2.toBack());
            root2.getChildren().add(but2);
            stage2.setTitle("okno3");
            stage2.setScene(scene2);
            stage2.sizeToScene();
            stage2.centerOnScreen();
            stage2.show();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
