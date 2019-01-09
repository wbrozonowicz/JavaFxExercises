package JAVAFX9_BOOK.Chapter05_Events;


import javafx.event.Event;
import javafx.scene.input.MouseEvent;

public interface IPrint {
    static void print(MouseEvent e) {
        String typ = e.getEventType().getName();
        String source = e.getSource().getClass().getSimpleName();
        String target = e.getTarget().getClass().getSimpleName();
        double sx = e.getSceneX();
        double sy = e.getSceneY();
        double ex = e.getScreenX();
        double ey = e.getScreenY();
        System.out.println("Typ zdarzenia: " + typ + ", Źródło zdarzenia: "
                + source + ", Cel zdarzenia: " + target);
        System.out.println(
                "Koordynaty zdarzenia na scenie: [" + sx + ", " + sy + "]");
        System.out.println("Koordynaty zdarzenia na wyświetlaczu: [" + ex + ", "
                + ey + "]");
    }

    static void printShort(Event e) {
        String typ = e.getEventType().getName();
        String source = e.getSource().getClass().getSimpleName();
        String target = e.getTarget().getClass().getSimpleName();
        System.out.println("Typ zdarzenia: " + typ + ", Źródło zdarzenia: "
                + source + ", Cel zdarzenia: " + target);
    }

    static void coords(MouseEvent e) {
        double tx = e.getX();
        double ty = e.getY();
        double sx = e.getSceneX();
        double sy = e.getSceneY();
        double ex = e.getScreenX();
        double ey = e.getScreenY();
        System.out.println(
                "Koordynaty zdarzenia w węźle: [" + tx + ", " + ty + "]");
        System.out.println(
                "Koordynaty zdarzenia na scenie: [" + sx + ", " + sy + "]");
        System.out.println("Koordynaty zdarzenia na wyświetlaczu: [" + ex + ", "
                + ey + "]");
    }
}