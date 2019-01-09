package JAVAFX9_BOOK.Chapter05_Events;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
// zdarzenie po naciśnięciu konkretnego klawisza
public class Chapter05_24 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            HBox root = new HBox();
            Label label = new Label("Wciśnij klawisz F3");
            TextField tf = new TextField();
            tf.setMinWidth(200);
            EventHandler<KeyEvent> keyHandler1 = e -> {
                if (e.getEventType() == KeyEvent.KEY_RELEASED
                        && e.getCode() == KeyCode.F3) {
                    tf.setText("Jesteś posłuszny!");
                }
            };
            tf.addEventHandler(KeyEvent.KEY_RELEASED, keyHandler1);
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
