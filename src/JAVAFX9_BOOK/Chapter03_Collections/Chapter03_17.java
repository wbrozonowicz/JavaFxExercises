package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableSet;
import javafx.collections.SetChangeListener;

// obserwacja zmian w observable set
public class Chapter03_17 {
    public static void main(String[] args) {
        ObservableSet<Integer> set = FXCollections.observableSet(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        set.addListener((SetChangeListener<Integer>) change -> {
            if (change.wasAdded()) {
                System.out.println(change.getElementAdded());
            } else if (change.wasRemoved()) {
                System.out.println(change.getElementRemoved());
            }
        });
        set.add(26);
        System.out.println(set);
        set.remove(4);
        System.out.println(set);
    }
}
