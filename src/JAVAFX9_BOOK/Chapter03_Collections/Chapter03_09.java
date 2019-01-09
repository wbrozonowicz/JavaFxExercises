package JAVAFX9_BOOK.Chapter03_Collections;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.LinkedList;
import java.util.List;

// tworzenie list z listy innego typu - przykład
public class Chapter03_09 {
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
        ObservableList<Integer> olist = FXCollections.observableList(list1);
        System.out.println(olist);
    }
}
