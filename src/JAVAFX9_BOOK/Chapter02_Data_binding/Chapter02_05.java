package JAVAFX9_BOOK.Chapter02_Data_binding;

import javafx.beans.property.*;

// właściwość read only - przykład, użycie w klasie Chapter02_06
public class Chapter02_05 {
    private final ReadOnlyStringWrapper nick = new ReadOnlyStringWrapper(this, "nick", "Unknown");
    private final ReadOnlyIntegerWrapper pesel = new ReadOnlyIntegerWrapper(this, "pesel");
    IntegerProperty numb = new SimpleIntegerProperty();

    public Chapter02_05(String nick, int pesel, int numbIn) {
        this.nick.set(nick);
        this.pesel.set(pesel);
        this.numb.set(numbIn);
    }

    public final String getNick() {
        return nick.get();
    }

    public final ReadOnlyStringProperty nickProperty() {
        return nick.getReadOnlyProperty();
    }

    public final int getPesel() {
        return pesel.get();
    }

    public final ReadOnlyIntegerProperty peselProperty() {
        return pesel.getReadOnlyProperty();
    }
}
