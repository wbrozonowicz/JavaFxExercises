package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.LinkedList;
import java.util.List;

// skopiowanie listy do ObservableList, elementy kopiowane zastępują istniejące, długość list musi być równa
public class Chapter03_10 {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);
        list1.add(12);
        list1.add(14);
        list1.add(16);
        list1.add(18);
        list1.add(20);
        list1.add(22);
        list1.add(24);
        ObservableList<Integer> olist1 = FXCollections.observableArrayList(1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25);
        FXCollections.copy(olist1, list1);
        System.out.println(olist1);
    }
}
