package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


import java.io.FileInputStream;


// okno z ikonką
public class Chapter04_12 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            StackPane root = new StackPane();
            Scene scene = new Scene(root,400,400);
            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            primaryStage.setTitle("Okienko z ikonką");
            Image image = new Image(new FileInputStream("dragon16.png"));
            primaryStage.getIcons().add(image);
            Button but = new Button("Zamknij mnie");
            but.setOnAction(e-> primaryStage.close());
            root.getChildren().add(but);
            primaryStage.show();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
