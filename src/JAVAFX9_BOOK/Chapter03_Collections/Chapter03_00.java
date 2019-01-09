package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

// tworzenie arraylist
public class Chapter03_00 {
    public static void main(String[] args) {
        ObservableList<Integer> olist = FXCollections.observableArrayList();
        olist.addListener((ListChangeListener<Integer>) c->{
            while (c.next()){
                if (c.wasRemoved()){
                    System.out.println("Usunięto: "+c.getRemoved());
                }
            }
        });
        olist.addAll(2,4,6,8,10);
        System.out.println(olist);
        olist.remove(3);
        olist.remove(Integer.valueOf(4));
        System.out.println(olist);
    }
}
