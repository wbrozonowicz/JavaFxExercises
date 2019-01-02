package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.beans.property.StringProperty;
import javafx.stage.Stage;

public class Chapter02_04 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Chapter02_03 pesel = new Chapter02_03();
        pesel.nickProperty().set("Jacek");
        pesel.peselProperty().set(520604);
        String nick = pesel.getNick();
        int nr = pesel.getPesel();
        System.out.println(nick + " / " + nr);
        String nick1 = pesel.nickProperty().get();
        int nr1 = pesel.peselProperty().get();
        System.out.println(nick1 + " / " + nr1);
        Platform.exit();
    }
}
