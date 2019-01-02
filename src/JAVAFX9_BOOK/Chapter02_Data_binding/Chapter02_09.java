package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.binding.NumberBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/*
Przykład wiązania wysokopoziomowego
stosowane gdy musimy wykonywać na zmiennych działania matematyczne
możliwe są metody:
add() - dodawanie
subtract() - odejmowanie
multiply() - mnożenie
divide() - dzielenie
kolejność od lewej do prawej (nie uwzględnia kolejności matematycznej - należy stosować nawiasy!!)
 */
public class Chapter02_09 {
    public static void main(String[] args) {
        // a*a + b*c - d
        IntegerProperty a = new SimpleIntegerProperty(2);
        IntegerProperty b = new SimpleIntegerProperty(5);
        IntegerProperty c = new SimpleIntegerProperty(7);
        IntegerProperty d = new SimpleIntegerProperty(11);
        NumberBinding wynik = a.multiply(a).add(b.multiply(c)).subtract(d);
        System.out.println("wynik= " + wynik.intValue() + "\n");

        // powierzchnia prostokąta o bokach x i y
        IntegerProperty x = new SimpleIntegerProperty(20);
        IntegerProperty y = new SimpleIntegerProperty(30);
        NumberBinding area = x.multiply(y);
        System.out.println("Wążna [area]? " + area.isValid());
        System.out.println("Powierzchnia = " + area.intValue());
        System.out.println("Wążna [area]? " + area.isValid());
        x.set(10);
        y.set(5);
        System.out.println("Wążna [area]? " + area.isValid());
        System.out.println("Powierzchnia = " + area.intValue());
        System.out.println("Wążna [area]? " + area.isValid());

    }
}
