package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

// okno modalne - blokuje dostęp do innych okien dopóki się go nie zamknie - opcja Modality.APPLICATION_MODAL
public class Chapter04_10 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Stage stage1 = new Stage();

        VBox root = new VBox();
        Button but = new Button("Zamknij okno główne");
        but.setOnAction(e -> primaryStage.close());
        root.getChildren().add(but);
        Button but2 = new Button("Otwórz okno podrzędne");
        but2.setOnAction(e -> stage1.show());
        root.getChildren().add(but2);
        Scene scene = new Scene(root,410,300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Okno na scenę");
        primaryStage.show();


        stage1.initOwner(primaryStage);
        stage1.initModality(Modality.APPLICATION_MODAL);
        VBox root1 = new VBox();
        Button but1 = new Button("Zamknij okno drugorzedne");
        but1.setOnAction(e -> stage1.close());
        root1.getChildren().add(but1);
        Scene scene1 = new Scene(root1,200,135);
        stage1.setScene(scene1);
        stage1.setTitle("Okno na scenę 2");
        stage1.show();
    }
}
