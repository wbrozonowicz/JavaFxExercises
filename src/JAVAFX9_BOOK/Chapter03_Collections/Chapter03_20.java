package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;


// przefiltrowanie listy do nowej - pobranie tylko elementów spełniających kryteria
import java.util.function.Predicate;
public class Chapter03_20 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13);
        FilteredList<Integer> flist = new FilteredList<>(olist, new Parzyste());
        System.out.println(flist);
        FilteredList<Integer> flist2 = new FilteredList<>(olist, new Wiekszeod10());
        System.out.println(flist2);

        // teraz to samo ale z wyrażeniem LAMBDA!!!
        FilteredList<Integer> flist3 = new FilteredList<>(olist,i->i>10);
        System.out.println(flist3);

    }
}

class Parzyste implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        return t % 2 == 0;
    }
}

class Wiekszeod10 implements Predicate<Integer> {
    @Override
    public boolean test(Integer t) {
        return t >10 ;
    }
}
