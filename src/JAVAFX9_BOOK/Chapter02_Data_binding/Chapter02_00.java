package JAVAFX9_BOOK.Chapter02_Data_binding;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;

// klasa ziarenko JAVA BEANS - przykład, użyty w klasie Chapter02_01 i Chapter02_12s

public class Chapter02_00 implements Serializable {
    private int liczbaKalorii;
    private final PropertyChangeSupport pcs = new PropertyChangeSupport(this);

    public Chapter02_00() {
        this(0);
    }

    public Chapter02_00(int liczbaKalorii) {
        this.liczbaKalorii = liczbaKalorii;
    }

    public int getLiczbaKalorii() {
        return liczbaKalorii;
    }

    public synchronized void addPropertyChangeListener(PropertyChangeListener list1) {
        pcs.addPropertyChangeListener(list1);
    }

    public synchronized void removePropertyChangeListener(PropertyChangeListener list2) {
        pcs.removePropertyChangeListener(list2);
    }

    public synchronized void setLiczbaKalorii(int newLiczbaKalorii) {
        int oldValue = liczbaKalorii;
        liczbaKalorii = newLiczbaKalorii;
        pcs.firePropertyChange("zmiana liczby kalorii", Integer.valueOf(oldValue), Integer.valueOf(newLiczbaKalorii));
    }
}
