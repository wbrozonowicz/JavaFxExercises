package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// minimalizacja i maksymalizacja okna
public class Chapter04_14 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Scene scene = new Scene(root, 400, 400);
            Button but = new Button("maximize");
            but.setOnAction(e -> primaryStage.setMaximized(true));
            Button but2 = new Button("minimized");
            but2.setOnAction(e -> primaryStage.setIconified(true));
            Button but3 = new Button("back to standard size");
            but3.setOnAction(e -> primaryStage.setMaximized(false));
            root.getChildren().addAll(but, but2, but3);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
