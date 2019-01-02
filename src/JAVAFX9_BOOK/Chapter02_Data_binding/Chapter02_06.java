package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Chapter02_06 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Chapter02_05 pesel = new Chapter02_05("Jacek", 520604, 69);
        System.out.println(pesel.getNick());
        System.out.println(pesel.getPesel());
        System.out.println("...");
        System.out.println(pesel.nickProperty().get());
        System.out.println(pesel.peselProperty().get());
        pesel.numb.addListener(((observableValue, oldValue, newValue) ->
        {
            System.out.println("Zmiana z " + oldValue + " na " + newValue);
        }));
        pesel.numb.set(99);
        pesel.numb.set(18);
        pesel.numb.set(9);
        Platform.exit();
    }
}
