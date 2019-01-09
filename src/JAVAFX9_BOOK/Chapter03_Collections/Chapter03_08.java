package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Comparator;

// tworzenie arraylist poprzez połączenie dwóch list + sosrtowanie listy
public class Chapter03_08 {
    public static void main(String[] args) {
        ObservableList<Integer> olist1 = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        ObservableList<Integer> olist2 = FXCollections.observableArrayList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19,  21, 23, 25);
        //@SuppressWarnings("unchecked")
        ObservableList<Integer> olist = FXCollections.concat(olist1, olist2);
        FXCollections.sort(olist); // rosnąco [default]
        System.out.println(olist);
        FXCollections.sort(olist, Comparator.reverseOrder()); // malejąco
        System.out.println(olist);
    }
}
