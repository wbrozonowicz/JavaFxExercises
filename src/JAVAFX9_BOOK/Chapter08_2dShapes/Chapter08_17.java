package JAVAFX9_BOOK.Chapter08_2dShapes;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.QuadCurve2D;
import java.awt.geom.Rectangle2D;

public class Chapter08_17 extends JFrame {
    private static final long serialVersionUID = -7568291202437376458L;
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Chapter08_17(new BezierPanel()));
    }

    public Chapter08_17(JComponent comp) {
        BezierPanel bezierPanel = new BezierPanel();
        setLayout(null);
        setPreferredSize(new Dimension(800, 800));
        setBounds(
                (Toolkit.getDefaultToolkit().getScreenSize().width / 2)
                        - (FRAME_WIDTH / 2),
                (Toolkit.getDefaultToolkit().getScreenSize().height / 2)
                        - (FRAME_HEIGHT / 2),
                FRAME_WIDTH, FRAME_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ramka Graficzna");
        add(bezierPanel, JLayeredPane.DRAG_LAYER);
        setVisible(true);
    }
}

class BezierPanel extends JPanel {
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;
    private static final long serialVersionUID = -1869343734912274887L;
    private static final int SIZE = 4;
    private final Point2D[] points = {new Point2D.Double(100, 100),
            new Point2D.Double(200, 100), new Point2D.Double(200, 200)};
    private final Color[] colors = {Color.blue, Color.RED, Color.BLUE};
    private int curr;

    public BezierPanel() {
        setPreferredSize(new Dimension(FRAME_WIDTH, FRAME_HEIGHT));
        setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                Point point = e.getPoint();
                double x;
                double y;
                Rectangle2D rect;
                for (int i = 0; i < points.length; i++) {
                    x = points[i].getX() - SIZE / 2;
                    y = points[i].getY() - SIZE / 2;
                    rect = new Rectangle2D.Double(x, y, SIZE, SIZE);
                    if (rect.contains(point)) {
                        curr = i;
                        return;
                    }
                }
            }

            @Override
            public void mouseReleased(MouseEvent ev) {
                curr = -1;
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent eve) {
                if (curr == -1) {
                    return;
                }
                points[curr] = eve.getPoint();
                repaint();
            }
        });
        curr = -1;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        if (points == null) {
            return;
        }
        double x;
        double y;
        for (int i = 0; i < points.length; i++) {
            x = points[i].getX() - SIZE / 2;
            y = points[i].getY() - SIZE / 2;
            g2.setColor(colors[i]);
            g2.fill(new Ellipse2D.Double(x, y, SIZE, SIZE));
        }
        g2.setColor(Color.BLUE);
        g2.draw(makeQuadCurve(points));
    }

    public static QuadCurve2D.Double makeQuadCurve(Point2D[] points) {
        return new QuadCurve2D.Double(points[0].getX(),
                points[0].getY(), points[1].getX(), points[1].getY(),
                points[2].getX(), points[2].getY());
    }
}