package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.binding.IntegerBinding;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

/*
Wiązanie niskopoziomowe - wygodniejsze do bardziej skomplikowanych obliczeń matematycznych
 */
public class Chapter02_10 {
    public static void main(String[] args) {
        // y = x3 + 2x2 - 3x + 2
        IntegerProperty x = new SimpleIntegerProperty();
        IntegerBinding y = new IntegerBinding() {
            {
                super.bind(x);
            }

            @Override
            protected int computeValue() {
                int xx = x.get();
                return xx * xx * xx + 2 * xx * xx - 3 * xx + 2;
            }
        };
        x.set(5);
        System.out.println("dla x = " + x.get() + " y = " + y.get());

        x.set(3);
        System.out.println("dla x = " + x.get() + " y = " + y.get());
    }
}
