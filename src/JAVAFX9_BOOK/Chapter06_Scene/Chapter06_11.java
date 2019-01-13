package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// zastoswanie CSSa
public class Chapter06_11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Label lbl = new Label("TEST");
            Scene scene = new Scene(root, 300, 300);
            Button button1 = new Button("test");
            root.getChildren().addAll(lbl, button1);

            scene.getStylesheets().clear();
            scene.getStylesheets().add(getClass().getResource("skorka2.css").toExternalForm());
            // css musi być w OUT/Production...
            System.out.println("dodano styl: " + scene.getStylesheets().toString());

            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
