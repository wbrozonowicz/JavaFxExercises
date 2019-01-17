package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

// tekst - przykład
public class Chapter08_07a extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Text tekst = new Text(10, 10, "Zombie ipsum reversus ab viral inferno, nam rick grimes malum cerebro. De carne lumbering animata corpora quaeritis. Summus brains sit\u200B\u200B, morbo vel maleficia? De apocalypsi gorger omero undead survivor dictum mauris. Hi mindless mortuis soulless creaturas, imo evil stalking monstra adventus resi dentevil vultus comedat cerebella viventium. Qui animated corpse, cricket bat max brucks terribilem incessu zomby. The voodoo sacerdos flesh eater, suscitat mortuos comedere carnem virus. Zonbi tattered for solum oculi eorum defunctis go lum cerebro. Nescio brains an Undead zombies. Sicut malus putrid voodoo horror. Nigh tofth eliv ingdead.\n" +
                    "\n");
            tekst.setWrappingWidth(300);
            tekst.setTextAlignment(TextAlignment.JUSTIFY);
            tekst.setVisible(false);
            Button butti = new Button("Pokaż mi stringi");
            butti.setOnAction(e -> {
                if (tekst.isVisible()) {
                    tekst.setVisible(false);
                    butti.setText("Pokaż mi stringi");
                } else {
                    tekst.setVisible(true);
                    butti.setText("Ukryj te stringi");
                }
            });
            Button butti2 = new Button("Zmień justowanie");

            butti2.setOnAction(e -> {
                tekst.setTextAlignment(TextAlignment.CENTER);

            });

            root.getChildren().addAll(butti, butti2, tekst);
            Scene scene = new Scene(root, 400, 400);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
