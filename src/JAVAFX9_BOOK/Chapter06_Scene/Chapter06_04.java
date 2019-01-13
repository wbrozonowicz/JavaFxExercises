package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chapter06_04 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label("Użyj skrótu klawiaturowego 'Alt+C'");
            VBox root = new VBox();
            Button but = new Button("Close");
            but.setOnAction(e -> stage.close());
            root.getChildren().addAll(label, but);
            Scene scene = new Scene(root, 410, 300);
            KeyCombination kk = new KeyCodeCombination(KeyCode.C,
                    KeyCombination.ALT_DOWN);
            Mnemonic close = new Mnemonic(but, kk);
            scene.addMnemonic(close);
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}