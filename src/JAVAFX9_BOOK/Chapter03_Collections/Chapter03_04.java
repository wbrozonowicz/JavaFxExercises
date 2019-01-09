package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

// tworzenie arraylist z istniejącej kolekcji
public class Chapter03_04 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(6);
        al.add(8);
        al.add(10);
        al.add(12);
        al.add(14);
        al.add(16);
        al.add(18);
        al.add(20);
        al.add(21);
        al.add(22);
        al.add(23);
        al.add(24);
        ObservableList<Integer> olist = FXCollections.observableArrayList(al);
        System.out.println(olist);
    }
}
