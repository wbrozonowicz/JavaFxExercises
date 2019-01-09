package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

// losowe wymieszanie elementóœ listy
public class Chapter03_14 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        System.out.println("Lista pierwotnie:");
        System.out.println(olist);
        System.out.println("...");
        System.out.println("Lista po wymieszaniu metodą shuffle:");
        FXCollections.shuffle(olist);
        System.out.println(olist);
    }
}
