package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// określenie krycia okna [nieprzezroczytsości]
public class Chapter04_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        StackPane root = new StackPane();
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.centerOnScreen();

        //primaryStage.setOpacity(1.0); // 100% krycia
        // primaryStage.setOpacity(0.75); // 75% krycia
        primaryStage.setOpacity(0.5); // 50% krycia
        // primaryStage.setOpacity(0.25); // 25% krycia
        // primaryStage.setOpacity(0.0); // 0% krycia (okno niewidoczne), UWAGA! przy tym ustawieniu nie odbiera zdarzeń myszy

        primaryStage.show();

    }
}
