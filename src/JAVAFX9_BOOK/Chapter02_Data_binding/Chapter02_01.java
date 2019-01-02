package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Chapter02_01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Chapter02_00 smok = new Chapter02_00();
        smok.addPropertyChangeListener(evt -> {
            Integer oldValue = (Integer) evt.getOldValue();
            Integer newValue = (Integer) evt.getNewValue();
            System.out.println("zmiana z " + oldValue + " na " + newValue);
        });
        for (int i = 0; i < 11; i++) {
            smok.setLiczbaKalorii(i * 1000);
        }
        Platform.exit();
    }
}

