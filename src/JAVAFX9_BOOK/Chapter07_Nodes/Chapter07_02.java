package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// ustawianie widzialności elementu root
public class Chapter07_02 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle circle = new Circle(80, 50, 30);
            circle.setFill(Color.RED);
            Circle circle1 = new Circle(350, 80, 30);
            circle1.setFill(Color.GREEN);
            Rectangle rect = new Rectangle(50, 250, 100, 60);
            rect.setFill(Color.BLUE);
            Button butt = new Button("Kliknij");
            Pane root = new Pane();
            Pane root1 = new Pane();
            root1.setBorder(new Border(
                    new BorderStroke(Color.AQUA, BorderStrokeStyle.SOLID,
                            CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            root1.getChildren().addAll(circle, rect);
            root1.setLayoutX(0);
            root1.setLayoutY(0);
            root1.setMinWidth(200);
            root1.setMinHeight(200);
            //root1.setVisible(false);
            Pane root2 = new Pane();
            root2.setBorder(new Border(
                    new BorderStroke(Color.RED, BorderStrokeStyle.SOLID,
                            CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            butt.setOnAction(e -> root1.setVisible(false));
            root2.getChildren().addAll(butt, circle1);
            root2.setLayoutX(220);
            root2.setLayoutY(0);
            root2.setMinWidth(150);
            root.getChildren().addAll(root1, root2);
            Scene scene = new Scene(root, 600, 400);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
