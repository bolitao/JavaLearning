package exp.cap14.exp75;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PaintLine extends JFrame {
    PaintLine(String title) {
        this.setTitle(title);
    }

    void init() {
        this.addMouseListener(new MouseAdapter() {
            int x1, y1, x2, y2;

            @Override
            public void mousePressed(MouseEvent e) {
                x1 = e.getX();
                y1 = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                x2 = e.getX();
                y2 = e.getY();
                Graphics g = PaintLine.this.getGraphics();
                g.setColor(Color.RED);
                g.drawLine(x1, y1, x2, y2);
                g.drawRect(300, 300, 300, 300);
            }
        });
    }
}
