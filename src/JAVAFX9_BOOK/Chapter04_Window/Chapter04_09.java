package JAVAFX9_BOOK.Chapter04_Window;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// okno podrzędne umieszczone w głównym
public class Chapter04_09 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            VBox root = new VBox();
            Button but = new Button("Zamknij okno główne");
            root.getChildren().add(but);
            Scene scene = new Scene(root, 410, 300);
            stage.setScene(scene);
            stage.setTitle("Okno na scenę");
            stage.setX(10);
            stage.setY(10);
            stage.show();
            //
            Stage stage1 = new Stage();
            stage1.initOwner(stage);
            VBox root1 = new VBox();
            Button but1 = new Button("Zamknij okno drugorzędne");
            root1.getChildren().add(but1);
            Scene scene1 = new Scene(root1, 200, 135);
            stage1.setScene(scene1);
            stage1.setTitle("Okno na scenę 2");
            stage1.setX(stage.getWidth() + 20);
            stage1.setY(stage.getY());
            stage1.show();
            //
            Stage stage2 = new Stage();
            stage2.initOwner(stage1);
            VBox root2 = new VBox();
            Button but2 = new Button("Zamknij okno trzeciorzędne");
            root2.getChildren().add(but2);
            Scene scene2 = new Scene(root2, 200, 135);
            stage2.setScene(scene2);
            stage2.setTitle("Okno na scenę 3");
            stage2.setX(stage.getWidth() + stage1.getWidth() + 30);
            stage2.setY(stage.getY());
            stage2.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}