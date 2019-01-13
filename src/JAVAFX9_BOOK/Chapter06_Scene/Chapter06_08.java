package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.WritableImage;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import javax.imageio.ImageIO;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;


// tworzenie snapshota z fragmentu sceny
public class Chapter06_08 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Label lbl = new Label("Zrzut ekranu po wcisnięciu CTRL+C");
            Circle crc = new Circle(50, 30, 30);
            crc.setFill(Color.BLUE);
            HBox root = new HBox();
            Scene scene = new Scene(root, 500, 400);
            root.setSpacing(20);
            KeyCombination kk = new KeyCodeCombination(KeyCode.C, KeyCombination.CONTROL_DOWN);
            scene.getAccelerators().put(kk, () -> {
                WritableImage w = new WritableImage(200,200);
                WritableImage wi = scene.snapshot(w);

                File file = new File("/home/wojciech/IdeaProjects/JavaFxExercises/src/JAVAFX9_BOOK/Chapter06_Scene/ryc06_02f.png");
                RenderedImage ri = SwingFXUtils.fromFXImage(wi, null);
                try {
                    ImageIO.write(ri, "png", file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            root.getChildren().addAll(lbl, crc);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

