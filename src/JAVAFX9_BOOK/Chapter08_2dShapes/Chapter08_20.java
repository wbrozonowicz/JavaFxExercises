package JAVAFX9_BOOK.Chapter08_2dShapes;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.CubicCurve2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Chapter08_20 extends JFrame {
    private static final long serialVersionUID = -7511538451932440982L;
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 400;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Chapter08_20(new BezierPanel2()));
    }

    public Chapter08_20(JComponent comp) {
        BezierPanel2 bezierPanel = new BezierPanel2();
        setLayout(null);
        setPreferredSize(new Dimension(400, 400));
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

class BezierPanel2 extends JPanel {
    private static final long serialVersionUID = 2514207776137719258L;
    public static final int FRAME_WIDTH = 800;
    public static final int FRAME_HEIGHT = 800;
    private static final int SIZE = 4;
    private final Point2D[] points = {new Point2D.Double(100, 100),
            new Point2D.Double(100, 200), new Point2D.Double(200, 100),
            new Point2D.Double(200, 200)};
    private final Color[] colors = {Color.blue, Color.RED, Color.RED, Color.BLUE};
    private int curr;

    public BezierPanel2() {
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
        g2.draw(makeCubicCurve(points));
    }

    public static CubicCurve2D.Double makeCubicCurve(Point2D[] points) {
        return new CubicCurve2D.Double(points[0].getX(),
                points[0].getY(), points[1].getX(), points[1].getY(),
                points[2].getX(), points[2].getY(), points[3].getX(),
                points[3].getY());
    }
}
