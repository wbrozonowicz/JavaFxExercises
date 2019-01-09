package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


// zdarzenia keytyped - wypisuje znak wpisany z klaiatury a nie wciśnięte klawisze
// np dla alt+a przechwyci "ą"
public class Chapter05_23 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            HBox root = new HBox();
            Label label = new Label("Wpisz jakieś znaki z klawiatury");
            TextField tf = new TextField();
            EventHandler<KeyEvent> keyHandler1 = e -> System.out.println("Wpisałeś znak: " + e.getCharacter());
            tf.addEventHandler(KeyEvent.KEY_TYPED, keyHandler1);
            root.getChildren().addAll(label, tf);
            Scene scene = new Scene(root, 300, 150);
            stage.setScene(scene);
            stage.setTitle("Zdarzenia myszy");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
