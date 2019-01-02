package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// ziarenko z włąściwościami, użyte w klasie Chapter02_04
public class Chapter02_03 {
    private final StringProperty nick = new SimpleStringProperty(this, "nick", "unknown");
    private final IntegerProperty pesel = new SimpleIntegerProperty(this, "pesel");

    public final StringProperty nickProperty() {
        return nick;
    }

    public final String getNick() {
        return nick.get();
    }

    public final void setNick(String nick) {
        this.nick.set(nick);
    }

    public final IntegerProperty peselProperty() {
        return pesel;
    }

    public final int getPesel() {
        return pesel.get();
    }

    public final void setPesel(int pesel) {
        this.pesel.set(pesel);
    }
}
