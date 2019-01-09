package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// ustawienie okna always on top
public class Chapter04_15 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 410, 100);
            Button but = new Button("Powrót");
            stage.setTitle("Is always on top?"+stage.isAlwaysOnTop() + "");
            but.setOnAction(e ->
                    {
                        if (stage.isAlwaysOnTop()) {
                            stage.setAlwaysOnTop(false);
                        } else {
                            stage.setAlwaysOnTop(true);
                        }
                        stage.setTitle("Is always on top?"+stage.isAlwaysOnTop() + " ");
                    }
            );
            root.getChildren().add(but);
            stage.setScene(scene);
            stage.setAlwaysOnTop(true);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}