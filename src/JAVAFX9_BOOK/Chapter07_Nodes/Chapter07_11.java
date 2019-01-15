package JAVAFX9_BOOK.Chapter07_Nodes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// nakładanie maski na widocznego node'a
public class Chapter07_11 extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Button butti = new Button("Maskuj");
            TextArea ta = new TextArea();
            ta.setText(
                    "Wiesz, Nel – mówił Staś Tarkowski do swojej przyjaciółki, małej "
                            + "Angielki – wczoraj przyszli zabtie (policjanci) i aresztowali żonę "
                            + "dozorcy Smaina i jej troje dzieci – tę Fatmę, która już kilka razy "
                            + "przychodziła do biura do twojego ojca i do mego. "
                            + "A mała, podobna do ślicznego obrazka Nel podniosła swe "
                            + "zielonawe oczy na Stasia i zapytała na wpół ze zdziwieniem, a na "
                            + "wpół ze strachem:" + " – Wzięli ją do więzienia? "
                            + "– Nie, ale nie pozwolili jej wyjechać do Sudanu i przyjechał "
                            + "urzędnik, który jej będzie pilnował, by ani krokiem nie wyruszyła z "
                            + "Port-Saidu." + " – Dlaczego? "
                            + "Staś, który kończył rok czternasty i który swą ośmioletnią "
                            + "towarzyszkę kochał bardzo, ale uważał za zupełne dziecko, rzekł z "
                            + "miną wielce zarozumiałą: "
                            + "– Jak dojdziesz do mego wieku, to będziesz wiedziała wszystko, "
                            + "co się dzieje nie tylko wzdłuż kanału, od Port-Saidu do Suezu, ale i w "
                            + "całym Egipcie. Czy ty nic nie słyszałaś o Mahdim? "
                            + "– Słyszałam, że jest brzydki i niegrzeczny. ");
            ta.setMaxWidth(280);
            ta.setMinHeight(190);
            ta.setWrapText(true);
            Rectangle blue = new Rectangle(50, 70, 120, 80);
            blue.setFill(Color.BLUE);
            blue.setRotate(30);
            butti.setOnAction(e->{
                if (ta.getClip()!=null){
                    ta.setClip(null);
                } else {
                    ta.setClip(blue);
                }
            });
            //ta.setClip(blue);
            VBox root = new VBox();
            root.getChildren().addAll(butti, ta);
            Scene scene = new Scene(root, 300, 200);
            stage.setTitle(this.getClass().getSimpleName());
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
