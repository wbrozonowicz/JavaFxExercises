package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.WeakChangeListener;


/*
weak listener - używany do aplikacji skomplikowanych, używających wielu listenerów
pozwala na automatyczne usuwanie takiego słabego listenera gdy nie jest już potrzebny  i zapobiega'
wyciekowi pamięci.
 */
public class Chapter02_11 {
    public static void main(String[] args) {
        IntegerProperty liczba = new SimpleIntegerProperty(0);
        ChangeListener<Number> list = (observable, oldValue, newValue) -> System.out.println("Wartość zmieniła się z " + oldValue + " na "
                + newValue); // najpierw stwórz zwykłego Listenera
        WeakChangeListener<Number> wlist = new WeakChangeListener<>(list); // potem użyj go w konstruktorze słabego listenera
        liczba.addListener(wlist);
        liczba.set(10);
        liczba.set(20);
    }
}
