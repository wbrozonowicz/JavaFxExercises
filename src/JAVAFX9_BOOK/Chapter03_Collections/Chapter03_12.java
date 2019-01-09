package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// odwrócenie kolejności elementów listy
public class Chapter03_12 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        FXCollections.reverse(olist);
        System.out.println(olist);
    }
}
