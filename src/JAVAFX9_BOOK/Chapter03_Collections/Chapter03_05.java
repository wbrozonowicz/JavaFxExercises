package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// tworzenie arraylist podając liste elementów
public class Chapter03_05 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(
                2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        System.out.println(olist);
    }
}
