package JAVAFX9_BOOK.Chapter01_Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class Chapter01_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parameters p = this.getParameters();
            List<String> unParams = p.getUnnamed();
            StackPane root = new StackPane();
            Scene scene = new Scene(root, Double.parseDouble(unParams.get(0)), Double.parseDouble(unParams.get(1)));
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
