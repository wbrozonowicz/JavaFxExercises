package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

// przykład jednostronnego wiązania (data binding) / można zmienić jedną zmienna, powiązana się dostosuje
public class Chapter02_07 {
    public static void main(String[] args) {
        IntegerProperty y = new SimpleIntegerProperty(10);
        IntegerProperty x = new SimpleIntegerProperty(5);
        System.out.println("y= " + y.get());
        System.out.println("x= " + x.get());
        y.bind(x);
        System.out.println("czy y jest związane? " + y.isBound());
        System.out.println("czy x jest związane? " + x.isBound());
        x.set(99);
        System.out.println("y= " + y.get());
        System.out.println("x= " + x.get());
        y.unbind();
        x.set(11);
        y.set(33);
        System.out.println("y= " + y.get());
        System.out.println("x= " + x.get());
    }
}
