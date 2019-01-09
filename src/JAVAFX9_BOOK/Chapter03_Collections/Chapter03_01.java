package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.List;

// śledzenie różnych zdarzeń w arraylist
public class Chapter03_01 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList();
        olist.addListener((ListChangeListener<Integer>) change -> {
            while (change.next()) {
                if (change.wasPermutated()) {
                    int start = change.getFrom();
                    int end = change.getTo();
                    for (int i = start; i < end; i++) {
                        int ni = change.getPermutation(i);
                        System.out.println("Element " + i
                                + "jest teraz na miejscu " + ni);
                    }
                } else if (change.wasUpdated()) {
                    int start = change.getFrom();
                    int end = change.getTo();
                    System.out.println("Elementy zaktualizowane: "
                            + change.getList().subList(start, end));
                } else if (change.wasReplaced()) {
                    List<? extends Integer> subl1 = change.getRemoved();
                    List<? extends Integer> subl2 = change
                            .getAddedSubList();
                    System.out.println(
                            "Zamieniono: " + subl1 + " na " + subl2);
                } else if (change.wasAdded()) {
                    int size = change.getAddedSize();
                    List<? extends Integer> subl = change.getAddedSubList();
                    System.out
                            .println("Dodano " + size + " elems: " + subl);
                } else if (change.wasRemoved()) {
                    int size = change.getRemovedSize();
                    List<? extends Integer> subl = change.getRemoved();
                    System.out.println(
                            "Usunięto " + size + " elems: " + subl);
                }
            }
        });
        olist.add(1);
        olist.addAll(2, 4, 6, 8, 10, 12, 14, 16, 18, 20);
        olist.remove(4);
        olist.remove(4);
        olist.set(0, 99);
        olist.set(5, 30);
        System.out.println(olist);
    }
}
