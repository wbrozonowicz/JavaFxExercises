package JAVAFX9_BOOK.Chapter04_Window;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

// użycie opcji showAndWait - aplikacja wstrzymuje wątek po wywołaniu tej metody i czeka, dopiero zmknięcie okna puszcza dalej wątek
public class Chapter04_17 extends Application {
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
            stage.show();
            //
            Stage stage1 = new Stage();
            stage1.initModality(Modality.WINDOW_MODAL);
            VBox root1 = new VBox();
            Button but1 = new Button("Zamknij okno drugorzędne");
            root1.getChildren().add(but1);
            Scene scene1 = new Scene(root1, 300, 200);
            stage1.setScene(scene1);
            stage1.setTitle("Okno na scenę 2");
            stage1.showAndWait();
            //
            Stage stage2 = new Stage();
            stage2.initOwner(stage1);
            stage2.initModality(Modality.WINDOW_MODAL);
            VBox root2 = new VBox();
            Button but2 = new Button("Zamknij okno 3");
            root2.getChildren().add(but2);
            Scene scene2 = new Scene(root2, 200, 100);
            stage2.setScene(scene2);
            stage2.setTitle("Okno na scenę 3");
            stage2.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
