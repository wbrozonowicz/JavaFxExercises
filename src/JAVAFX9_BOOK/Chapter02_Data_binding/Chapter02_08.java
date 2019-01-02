package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

// przykłąd wiązania dwustronnego (każda zmianna jednej zmiennej wpływa tak samo na drugą)
public class Chapter02_08 {
    public static void main(String[] args) {
        IntegerProperty y = new SimpleIntegerProperty(10);
        IntegerProperty x = new SimpleIntegerProperty(5);
        System.out.println("x= " + x.get());
        System.out.println("y= " + y.get());
        y.bindBidirectional(x);
        System.out.println("y po związaniu = " + y.get());
        System.out.println("Czy x jest związane? " + x.isBound()); // metoda isBound() zwraca true tylko przy wiązaniu jednostronnym!!!
        System.out.println("Czy y jest związane? " + y.isBound()); // metoda isBound() zwraca true tylko przy wiązaniu jednostronnym!!!
        x.set(77);
        System.out.println("x= " + x.get());
        System.out.println("y= " + y.get());
        y.set(112);
        System.out.println("x= " + x.get());
        System.out.println("y= " + y.get());

    }
}
