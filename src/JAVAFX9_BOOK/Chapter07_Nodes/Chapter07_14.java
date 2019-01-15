package JAVAFX9_BOOK.Chapter07_Nodes;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


// wymuszenie fokusu na określonym node
public class Chapter07_14 extends Application {


    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Button przycisk1 = new Button("Przycisk 1");
            Button przycisk3 = new Button("Przycisk 3");
            Button przycisk2 = new Button("Przycisk 2");
            Pane root = new Pane();
            HBox root1 = new HBox();
            root1.getChildren().addAll(przycisk1, przycisk2);
            HBox root2 = new HBox();
            root2.getChildren().addAll(przycisk3);
            root2.setLayoutX(220);
            root2.setLayoutY(0);
            root.getChildren().addAll(root1, root2);
            Scene scene = new Scene(root, 300, 150);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
            przycisk2.requestFocus(); // medota wymuszenia fokusa na node
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
