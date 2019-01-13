package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// ustawienie danych użytkownika dla sceny [może być dowolny obiekt]
public class Chapter06_06 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            VBox root = new VBox();
            Button but = new Button("Dane użytkownika");
            root.getChildren().addAll(but);
            Scene scene = new Scene(root, 410, 300);
            but.setOnAction(e -> System.out.println(scene.getUserData().toString()));
            scene.setUserData("Nie zapomnij wypić porannej kawy");
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
