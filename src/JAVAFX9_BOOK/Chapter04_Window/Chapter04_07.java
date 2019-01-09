package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// ograniczenie max i min rozmiarów okna - user może je resizeble tylko w ustalonym zakresie

public class Chapter04_07 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.centerOnScreen();
            primaryStage.setMinWidth(300);
            primaryStage.setMinHeight(300);
            primaryStage.setMaxWidth(500);
            primaryStage.setMaxHeight(500);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
