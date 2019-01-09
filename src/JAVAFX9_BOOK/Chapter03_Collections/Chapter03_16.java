package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.Comparator;

public class Chapter03_16 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24);
        FXCollections.sort(olist);
        System.out.println(olist);
        FXCollections.sort(olist, new IntComparator());
        System.out.println(olist);
        int a =42;
        int b = 40;

        IntComparator ic = new IntComparator();
        System.out.println(a+" compare with "+b+" = "+ic.compare(a,b));
    }
}

class IntComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return o2.compareTo(o1);
    }
}
