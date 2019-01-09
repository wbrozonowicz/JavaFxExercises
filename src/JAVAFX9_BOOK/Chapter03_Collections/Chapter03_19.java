package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableIntegerArray;

// tablica typ↓w prostych - obserwowalna
public class Chapter03_19 {
    public static void main(String[] args) {
        ObservableIntegerArray otable = FXCollections.observableIntegerArray();
        otable.addAll(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        System.out.println(otable);
        // dodanie listenera i obserwowanie zmian
        otable.addListener((observableArray, sizeChanged, from, to ) ->
                System.out.println("zmiana od "+from+" do "+to));
        System.out.println(otable);
        otable.addAll(3,5,6);
        System.out.println(otable);
        otable.set(0,69);
        System.out.println(otable);
    }
}
