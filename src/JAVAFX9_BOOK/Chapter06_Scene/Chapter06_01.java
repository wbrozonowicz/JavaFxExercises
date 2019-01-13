package JAVAFX9_BOOK.Chapter06_Scene;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Chapter06_01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            VBox root = new VBox();
            Scene scene = new Scene(root, 500, 500);
            primaryStage.setScene(scene);
            int currentNo = 0;
            Cursor[] kursor = {Cursor.DEFAULT, Cursor.CLOSED_HAND, Cursor.CROSSHAIR, Cursor.W_RESIZE, Cursor.NE_RESIZE, Cursor.NW_RESIZE, Cursor.TEXT, Cursor.WAIT};
            primaryStage.setTitle("Kursory");
            Label lbl = new Label("Aplikacja zmieniająca kursor po kliknięciu w przycisk.");
            Label lbl1 = new Label("Aktualnie ustawiony kursor:");
            Label lbl2 = new Label(currentNo + "");
            Label lbl3 = new Label(kursor[currentNo].toString());

            Button bt1 = new Button("Change cursor");
            int i = kursor.length - 1;
            bt1.setOnAction(e -> {
                int isNo = Integer.parseInt(lbl2.getText());
                if (isNo < i) {
                    isNo++;
                } else {
                    isNo = 0;
                }
                scene.setCursor(kursor[isNo]);
                lbl2.setText(isNo + "");
                lbl3.setText(kursor[isNo].toString());
            });
            root.getChildren().addAll(bt1, lbl, lbl1, lbl2, lbl3);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
