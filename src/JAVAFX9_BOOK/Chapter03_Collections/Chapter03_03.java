package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.beans.Observable;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.util.Callback;

// Śledzenie zmian elementów w arraylist
public class Chapter03_03 {
        public static void main(String[] args) {
            Callback<IntegerProperty, Observable[]> ex = p -> {
                System.out.println("Aktualnie przetwarzany element to: " + p);
                return new Observable[]{p};
            };
            ObservableList<IntegerProperty> olist = FXCollections.observableArrayList(ex);
            IntegerProperty a = new SimpleIntegerProperty(1);
            IntegerProperty b = new SimpleIntegerProperty(2);
            IntegerProperty c = new SimpleIntegerProperty(4);
            IntegerProperty d = new SimpleIntegerProperty(6);
            IntegerProperty e = new SimpleIntegerProperty(8);
            IntegerProperty f = new SimpleIntegerProperty(10);
            IntegerProperty g = new SimpleIntegerProperty(12);
            IntegerProperty h = new SimpleIntegerProperty(14);
            IntegerProperty i = new SimpleIntegerProperty(16);
            IntegerProperty j = new SimpleIntegerProperty(18);
            IntegerProperty k = new SimpleIntegerProperty(20);
            olist.add(a);
            olist.addAll(b, c, d, e, f, g, h, i, j, k);
            olist.remove(4);
            olist.remove(c);
            System.out.println(olist);
        }
}
