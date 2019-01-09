package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.beans.property.ReadOnlyDoubleProperty;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// ustawianie i pobieranie rozmiaru okna - preferowana metoda w klasie Chapter04_02!!
public class Chapter04_01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setWidth(110);
            double width = primaryStage.getWidth();
            System.out.println(width);
            ReadOnlyDoubleProperty rodp = primaryStage.widthProperty();
            System.out.println(rodp.doubleValue());

            primaryStage.setHeight(220);
            double height = primaryStage.getHeight();
            System.out.println(height);
            ReadOnlyDoubleProperty rodph = primaryStage.heightProperty();
            System.out.println(rodph.doubleValue());
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
