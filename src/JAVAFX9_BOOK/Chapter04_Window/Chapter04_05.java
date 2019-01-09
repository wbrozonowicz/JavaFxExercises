package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
// ustawianie różnych scen
public class Chapter04_05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene1 = new Scene(root, 200, 200);
            primaryStage.setScene(scene1);
            primaryStage.sizeToScene();
            primaryStage.centerOnScreen();


            // zmieniamy na inna scenę
            StackPane root2 = new StackPane();
            Scene scene2 = new Scene(root2, 400, 400);
            primaryStage.setScene(scene2);
            primaryStage.sizeToScene();
            primaryStage.show();
        } catch (Exception e){
            System.out.println("Błąd!!");
            e.printStackTrace();
        }
    }
}
