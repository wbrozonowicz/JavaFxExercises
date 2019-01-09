package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// pusta niemodyfikowalna lista [do użycia w szczególnych przypadkach]
public class Chapter03_07 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.emptyObservableList();
        System.out.println(olist);
        olist.add(Integer.valueOf(5));
        System.out.println(olist);
    }
}
