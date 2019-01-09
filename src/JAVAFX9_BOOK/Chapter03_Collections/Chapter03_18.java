package JAVAFX9_BOOK.Chapter03_Collections;

import javafx.collections.FXCollections;
import javafx.collections.MapChangeListener;
import javafx.collections.ObservableMap;

// obserwacja zmian w observable hashmap
public class Chapter03_18 {
    public static void main(String[] args) {
        ObservableMap<String, Integer> map = FXCollections.observableHashMap();
        map.put("Jacek", 1952);
        map.put("Mirka", 1953);
        map.put("Urszula", 1983);
        map.put("Suita", 2014);
        map.put("Menuet", 2010);
        map.put("Gawot", 2012);
        System.out.println(map);
        map.addListener((MapChangeListener<String, Integer>) change -> {
            if (change.wasAdded()) {
                System.out.println("Dodano: " + change.getKey() + " "
                        + change.getValueAdded());
            } else if (change.wasRemoved()) {
                System.out.println("Usunięto: " + change.getKey() + " "
                        + change.getValueRemoved());
            }
        });
        map.put("Bemol", 2005);
        System.out.println(map);
        map.remove("Bemol", 2005);
        System.out.println(map);
        String odczyt = map.toString();
        System.out.println(odczyt);
    }
}
