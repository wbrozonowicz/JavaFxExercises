package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.scene.CacheHint;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


// obliczenie pola powierzchni node'a
public class Chapter07_15 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Circle green = new Circle(80, 50, 30);
            green.setFill(Color.GREEN);
            Circle brown = new Circle(90, 100, 30);
            brown.setFill(Color.BROWN);
            Rectangle blue = new Rectangle(50, 70, 120, 80);
            blue.setFill(Color.BLUE);
            blue.setRotate(30);
            blue.setCache(true);
            blue.setCacheHint(CacheHint.ROTATE);
            Pane root = new Pane();
            root.getChildren().addAll(green, blue, brown);
            Scene scene = new Scene(root, 230, 200);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
            System.out.println("Powierzchnia prostokąta: "
                    + blue.computeAreaInScreen() + " piksela");  // policz powierzchnie
            System.out.println("Powierzchnia brązowego kółka: "
                    + brown.computeAreaInScreen() + " piksela");
            System.out.println("Powierzchnia zielonego kółka: "
                    + green.computeAreaInScreen() + " piksela");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
