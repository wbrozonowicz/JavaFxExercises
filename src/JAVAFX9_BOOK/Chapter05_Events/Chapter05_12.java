package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

// metoda fireEvent - zmknięcie okna przyciskiem
public class Chapter05_12 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            HBox root = new HBox();
            Button butti = new Button("Close me");
            butti.setOnAction(e ->
            {
                primaryStage.fireEvent(new WindowEvent(primaryStage, WindowEvent.WINDOW_CLOSE_REQUEST));
            });
            root.getChildren().add(butti);
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
