package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// zliczamy i wyświetlamy kliknięcia myszy
public class Chapter05_20a extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        try {
            VBox root = new VBox();
            Scene scene = new Scene(root, 400, 400);
            Label label = new Label("Kliknięć = ");
            Label label1 = new Label("0");
            // int  countTotal=0; // wszystkie kliknięcie od uruchomienia
            EventHandler<MouseEvent> mouseHandler = e -> {
                int count = e.getClickCount();
                int sum = Integer.parseInt(label1.getText());
                sum += count; // dodaj kliknięcia z tego zdarzenia
                label1.setText(sum + "");
            };
            root.addEventHandler(MouseEvent.MOUSE_CLICKED, mouseHandler);
            primaryStage.setScene(scene);
            root.getChildren().addAll(label, label1);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
