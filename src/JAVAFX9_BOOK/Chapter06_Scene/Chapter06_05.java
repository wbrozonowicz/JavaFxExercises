package JAVAFX9_BOOK.Chapter06_Scene;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chapter06_05 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label(
                    "Aby zamknąć użyj skrótu klawiaturowego 'Ctrl+C'");
            VBox root = new VBox();
            root.getChildren().addAll(label);
            Scene scene = new Scene(root, 410, 300);
            KeyCombination kk = new KeyCodeCombination(KeyCode.C,
                    KeyCombination.CONTROL_DOWN);
            scene.getAccelerators().put(kk, stage::close);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}