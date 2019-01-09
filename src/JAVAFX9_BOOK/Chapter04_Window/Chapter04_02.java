package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyBooleanProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// preferowany sposób ustaiania wartosci okna - poprzez rozmiar sceny
public class Chapter04_02 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 400, 200);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.show();
            double width = scene.getWidth();
            double height = scene.getHeight();
            System.out.println("Wymiary sceny to: " + width + "x" + height + "px");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
