package JAVAFX9_BOOK.Chapter05_Events;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

// przeciąganie obiektu między dwoma kontenerami - zdarzenie mouse drag
public class Chapter05_21 extends Application {
    private double newX, newY, oldX, oldY, offx, offy;
    private Rectangle rect;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {

            Label label = new Label("Spróbuj przeciągnąć prostokąt");
            Circle circ = new Circle(80, 50, 30);
            circ.setFill(Color.RED);
            Circle circ1 = new Circle(350, 80, 30);
            circ1.setFill(Color.GREEN);
            rect = new Rectangle(50, 250, 100, 60);
            rect.setFill(Color.BLUE);
            Pane root = new Pane();
            Pane root1 = new Pane();
            root1.setBorder(new Border(new BorderStroke(Color.AQUA, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            root1.getChildren().addAll(label, circ, rect);
            root1.setLayoutX(0);
            root1.setLayoutY(0);
            root1.setMinWidth(200);
            root1.setMinHeight(200);
            Pane root2 = new Pane();
            root2.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, CornerRadii.EMPTY, BorderWidths.DEFAULT)));
            root2.getChildren().add(circ1);
            root2.setLayoutX(220);
            root2.setLayoutY(0);
            root2.setMinWidth(150);
            root2.setMinHeight(200);
            //-
            EventHandler<MouseEvent> mouseHandler1 = e -> {
                oldX = rect.getX();
                oldY = rect.getY();
                rect.setMouseTransparent(true);
                offx = rect.getX() - e.getX();
                offy = rect.getY() - e.getY();
            };
            EventHandler<MouseEvent> mouseHandler2 = e -> {
                newX = e.getX() + offx;
                newY = e.getY() + offy;
                double x = Math.min(oldX, newX);
                double y = Math.min(oldY, newY);
                rect.setX(x);
                rect.setY(y);
                oldX = newX;
                oldY = newY;
            };
            EventHandler<MouseEvent> mouseHandler3 = e -> rect.setMouseTransparent(false);
            EventHandler<MouseEvent> mouseHandler4 = e -> rect.startFullDrag();
            EventHandler<MouseDragEvent> mouseHandler5 = e -> {
                double xx = e.getX() + offx;
                double yy = e.getY() + offy;
                rect.setX(xx);
                rect.setY(yy);
                if (!((Pane) e.getSource()).getChildren().contains(rect)) {
                    ((Pane) e.getSource()).getChildren().add(rect);
                }
                root2.toFront();
                System.out.println("root: " + root.getChildren());
                System.out.println("root1: " + root1.getChildren());
                System.out.println("root2: " + root2.getChildren());
            };
            EventHandler<MouseDragEvent> mouseHandler6 = e -> {
                double xx = e.getX() + offx;
                double yy = e.getY() + offy;
                rect.setX(xx);
                rect.setY(yy);
                if (!((Pane) e.getSource()).getChildren().contains(rect)) {
                    ((Pane) e.getSource()).getChildren().add(rect);
                }
                root1.toFront();
                System.out.println("root: " + root.getChildren());
                System.out.println("root1: " + root1.getChildren());
                System.out.println("root2: " + root2.getChildren());
            };
            root1.addEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler1);
            root1.addEventHandler(MouseEvent.MOUSE_DRAGGED, mouseHandler2);
            root1.addEventHandler(MouseEvent.MOUSE_RELEASED, mouseHandler3);
            root1.addEventHandler(MouseEvent.DRAG_DETECTED, mouseHandler4);
            root1.addEventHandler(MouseDragEvent.MOUSE_DRAG_RELEASED,
                    mouseHandler5);
            root2.addEventHandler(MouseEvent.MOUSE_PRESSED, mouseHandler1);
            root2.addEventHandler(MouseEvent.MOUSE_DRAGGED, mouseHandler2);
            root2.addEventHandler(MouseEvent.MOUSE_RELEASED, mouseHandler3);
            root2.addEventHandler(MouseEvent.DRAG_DETECTED, mouseHandler4);
            root2.addEventHandler(MouseDragEvent.MOUSE_DRAG_RELEASED,
                    mouseHandler6);
            root.getChildren().addAll(root1, root2);
            Scene scene = new Scene(root, 600, 400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Zdarzenia myszy");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
