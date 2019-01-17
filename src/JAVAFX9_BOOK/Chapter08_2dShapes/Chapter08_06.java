package JAVAFX9_BOOK.Chapter08_2dShapes;

import javafx.scene.text.Font;

import java.awt.*;
import java.util.List;

//wylistowanie wszystkich czcionek
public class Chapter08_06 {
    public static void main(String[] args) {
        List<String> czcionki = Font.getFontNames();
        for (String a :
                czcionki) {
            System.out.println(a);
        }

        System.out.println("Czcionki arial:");

        List<String> ariale = Font.getFontNames("Arial");
        for (String b :
                ariale) {
            System.out.println(b);
        }
        System.out.println("----");
        List<String> fonty = Font.getFamilies();
        for (String c : fonty) {
            System.out.println(c);
        }

    }
}
