package JAVAFX9_BOOK.Chapter01_Basics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;
import java.util.Map;

public class Chapter01_03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parameters p = this.getParameters();
            Map<String, String> nParams = p.getNamed();
            List<String> unParams = p.getUnnamed();
            List<String> rParams = p.getRaw();
            TextArea ta = new TextArea(nParams + "\n" + unParams + "\n" + rParams);
            StackPane root = new StackPane();
            root.getChildren().add(ta);
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
