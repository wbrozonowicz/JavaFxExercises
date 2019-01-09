package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

// style okna
public class Chapter04_08 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 500, 500);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.centerOnScreen();
            //primaryStage.initStyle(StageStyle.DECORATED); // default style
            // primaryStage.initStyle(StageStyle.UNDECORATED); // bez paska górnego
            // primaryStage.initStyle(StageStyle.TRANSPARENT); // przeżroczyste i bez paska
            //primaryStage.initStyle(StageStyle.UNIFIED); // różnica widoczna tylko na niektórych sstemach - brak konturu między ikonami a tłem
            // primaryStage.initStyle(StageStyle.UTILITY); // tylko z ikonką zamykania [nie ma w niektórych systemach)
            primaryStage.setTitle(primaryStage.getStyle().toString()); // pokaż w tytule styl
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
