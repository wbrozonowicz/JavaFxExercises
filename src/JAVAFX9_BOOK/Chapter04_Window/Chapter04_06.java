package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.collections.ObservableMap;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


// odczyt właściwości okna oraz dodawanie/odczyt opisu okna (pole userData)
public class Chapter04_06 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            StackPane root = new StackPane();
            Scene scene = new Scene(root, 300, 300);
            primaryStage.setScene(scene);
            primaryStage.sizeToScene();
            primaryStage.centerOnScreen();
            System.out.println("Czy okno ma właściwości?:" + primaryStage.hasProperties());
            System.out.println("Ustawiam userData");
            primaryStage.setUserData("To jest moje okno!!!");
            System.out.println((String) primaryStage.getUserData());
            primaryStage.setTitle("Tytuł okna");
            System.out.println("Czy okno ma właściwości?:" + primaryStage.hasProperties());
            ObservableMap<Object, Object> wlasciwosci = primaryStage.getProperties();
            System.out.println("Pokazuje ustawione własciwości: " + wlasciwosci);

            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
