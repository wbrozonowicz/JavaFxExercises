package JAVAFX9_BOOK.Chapter07_Nodes;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// ustawianie aktywny / nieaktywny dla węzłów i ich potomnych
// ważne jest by ustawić odpowiednio dla rodzica i dzieci!!
public class Chapter07_13 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            HBox root1 = new HBox();
            Button przycisk1 = new Button("Przycisk 1");
            Button przycisk3 = new Button("Przycisk 3");
            Button przycisk4 = new Button("Przycisk 4");
            przycisk3.setOnAction(e->{
                if (!root1.isDisable())
                root1.setDisable(true);
                else root1.setDisable(false);
            });
            przycisk4.setOnAction(e->{
                if(przycisk1.isDisable()) {
                    przycisk1.setDisable(false);
                }
                    else przycisk1.setDisable(true);

            });
            Button przycisk2 = new Button("Przycisk 2");
            Pane root = new Pane();

            root1.getChildren().addAll(przycisk1, przycisk2);
            root1.setDisable(true);
            VBox root2 = new VBox();
            root2.getChildren().addAll(przycisk3, przycisk4);
            root2.setLayoutX(220);
            root2.setLayoutY(0);
            root.getChildren().addAll(root1, root2);
            Scene scene = new Scene(root, 300, 150);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
