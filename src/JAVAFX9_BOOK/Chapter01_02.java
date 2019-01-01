package JAVAFX9_BOOK;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chapter01_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            System.out.println("Uruchomiłem metodę start()");
            Label label = new Label("Witaj świecie :-) ");
            VBox root = new VBox();
            Button stopButton = new Button("Żegnaj świecie :-( ");
            stopButton.setOnAction(e -> {
                System.out.println("Kliknięto przycisk");
                Platform.exit();
            });
            root.getChildren().addAll(label, stopButton);
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
