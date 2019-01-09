package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.Instant;
import java.util.Random;

// wymieszanie listy przy użyciu obiektu Random
public class Chapter03_15 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        System.out.println("Lista pierwotnie:");
        System.out.println(olist);
        Random rnd = new Random(Instant.now().toEpochMilli());
        FXCollections.shuffle(olist, rnd);
        System.out.println("Lista po wymieszaniu:");
        System.out.println(olist);
    }
}
