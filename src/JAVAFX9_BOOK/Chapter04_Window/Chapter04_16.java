package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// tryb full screen
public class Chapter04_16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Scene scene = new Scene(root, 400, 400);
            Button butt = new Button("go full screen");
            butt.setOnAction(e -> {
                if (primaryStage.isFullScreen()) {
                    primaryStage.setFullScreen(false);
                    butt.setText("go full screen");
                } else {
                    primaryStage.setFullScreen(true);
                    butt.setText("exit full screen");
                }
            });
            System.out.println(primaryStage.getFullScreenExitHint());
            primaryStage.setFullScreenExitHint("Wojteczku, klapnij w escape aby wyjść lub użyj buttona");
            root.getChildren().add(butt);
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
