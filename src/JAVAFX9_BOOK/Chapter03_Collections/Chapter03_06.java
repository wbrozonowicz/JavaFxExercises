package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// lista z deklaracją typu
public class Chapter03_06 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        ObservableList<Integer> checkedList = FXCollections.checkedObservableList(olist, Integer.class);
        System.out.println(checkedList);

        ObservableList<String> olist2 = FXCollections.observableArrayList("jeden", "dwa", "trzy");
        ObservableList<String> checkedList2 = FXCollections.checkedObservableList(olist2, String.class);
        System.out.println(checkedList2);
    }
}
