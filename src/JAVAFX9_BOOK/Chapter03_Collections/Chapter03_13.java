package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// przesunięcie elementów listy o podaną odległość, elementy wracają na początek przy przekroczeniu indeksu
public class Chapter03_13 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        FXCollections.rotate(olist, 3);
        System.out.println(olist);
    }
}
