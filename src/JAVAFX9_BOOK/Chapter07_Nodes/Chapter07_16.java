package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Rectangle2D;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
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
// zrzut wezła do pliku graficznego z ograniczeniem widoku
public class Chapter07_16 extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Label label = new Label("Zrzut ekranu po naciśnięciu 'Ctrl+C'");
            Circle circle = new Circle(50, 50, 30);
            circle.setFill(Color.BLUE);
            HBox root = new HBox();
            root.setSpacing(20);
            root.getChildren().addAll(label, circle);
            Scene scene = new Scene(root, 410, 200);
            scene.setCursor(Cursor.DEFAULT);
            KeyCombination kk = new KeyCodeCombination(KeyCode.C,
                    KeyCombination.CONTROL_DOWN);
            SnapshotParameters params = new SnapshotParameters();
            params.setViewport(new Rectangle2D(0, 0, 270, 100)); // ogranizenie obszaru zrzutu
            scene.getAccelerators().put(kk, () -> {
                WritableImage wi = root.snapshot(params, null);
                File file = new File("ryc07_15.png");
                RenderedImage ri = SwingFXUtils.fromFXImage(wi, null);
                try {
                    ImageIO.write(ri, "png", file);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            stage.setScene(scene);
            stage.setTitle("Scena");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
