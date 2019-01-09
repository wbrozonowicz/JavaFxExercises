package JAVAFX9_BOOK.Chapter05_Events;

import javafx.scene.input.KeyCode;

public class Chapter05_25 {
    public static void main(String[] args) {
        // wyisz dostępne kody klawiszy

        for (KeyCode kc :
                KeyCode.values()) {
            System.out.println(kc.ordinal() + ", " + kc.getName() + ", " + kc.name()); // ordinal to numer porządkowy
        }
    }
}
