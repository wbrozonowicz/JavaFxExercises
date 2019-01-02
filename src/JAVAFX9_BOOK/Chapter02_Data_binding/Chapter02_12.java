package JAVAFX9_BOOK.Chapter02_Data_binding;

;
import javafx.beans.property.adapter.JavaBeanIntegerProperty;
import javafx.beans.property.adapter.JavaBeanIntegerPropertyBuilder;

/*
przekształcenie ziarna JavaBean w ziarno JavaBeanFx
odbywa się za pomoca adaptera
*/
public class Chapter02_12 {
    public static void main(String[] args) {
        Chapter02_00 kalorie = new Chapter02_00();
        JavaBeanIntegerProperty kalorieProperty = null;
        try {
            kalorieProperty = JavaBeanIntegerPropertyBuilder.create().bean(kalorie).name("liczbaKalorii").build();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        if (kalorieProperty != null) {
            kalorieProperty.addListener((observable, oldValue, newValue) ->
                    System.out.println("Zmiana z " + oldValue + " na " + newValue)
            );
            kalorieProperty.set(1000);
            System.out.println(kalorieProperty.get());
            System.out.println(kalorie.getLiczbaKalorii());
        }
    }
}
