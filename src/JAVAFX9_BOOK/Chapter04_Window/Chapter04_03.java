package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Screen;
import javafx.stage.Stage;

// położenie okna na ekranie
public class Chapter04_03 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 100, 300);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();


            // położenie w pix od left cornen
            primaryStage.setX(0);
            primaryStage.setY(0);
            primaryStage.show();

            // położenie w zleżności od rozmiarów ekranu
            double width = 200;
            double height = 200;
            primaryStage.setWidth(width);
            primaryStage.setHeight(height);
            Rectangle2D rect = Screen.getPrimary().getVisualBounds();
            System.out.println("Ekran ma [bez pasków]=" + rect);
            // ustaw 10px do prawego górnego rogu, wysokość na cały ekran
//        primaryStage.setHeight(rect.getHeight()-10);
//        primaryStage.setX(rect.getWidth()-width-10);
//        primaryStage.setY(10);

            // ustawiamy dokładnie na środku wyliczając polożenie z parametrów screena
            primaryStage.setX((rect.getWidth() - width) / 2.0);
            primaryStage.setY((rect.getHeight() - height) / 2.0);

            //primaryStage.centerOnScreen(); // wycentruj na ekrenie w połowie szerokości i 1/3 wysokości (najbardziej naturalne położeni dla ludzkiego oka)

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
