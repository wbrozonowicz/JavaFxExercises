package JAVAFX9_BOOK;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Chapter01_01 extends Application {

    public static void main(String[] args) {
        System.out.println("Uruchomile metodę main");
        Application.launch(args);
        System.out.println("Wróciłem do metody main");
    }

    public void init() {
        System.out.println("Uruchomiłem metodę init()");
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 500, 200);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        System.out.println("uruchomiłem metodę stop()");
    }

}