package exp.cap14.exp77;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;
import java.util.Vector;

public class RedrawOval extends JFrame {
    Vector<MyOval> vOvals = new Vector<MyOval>();

    public Vector<MyOval> getvOvals() {
        return vOvals;
    }

    public void init() {
        this.setTitle("RedrawOval shape");
        this.setSize(300, 300);
        JPanel pan = new MyPanel();
        add(pan);
        pan.setBounds(0, 0, 300, 300);
        pan.addMouseListener(new MouseAdapter() {
            int orgX, orgY;

            @Override
            public void mousePressed(MouseEvent e) {
                orgX = e.getX();
                orgY = e.getY();
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                Graphics g = e.getComponent().getGraphics();
                g.setColor(Color.red);
                g.drawOval(orgX, orgY, e.getX() - orgX, e.getY() - orgY);
                vOvals.add(new MyOval(orgX, orgY, e.getX() - orgX, e.getY() - orgY));
            }
        });
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        @Override
        public void paintComponents(Graphics g) {
            g.setColor(Color.red);
            Enumeration e = vOvals.elements();
            while (e.hasMoreElements()) {
                MyOval ln = (MyOval) e.nextElement();
                ln.drawMe(g);
            }
        }
    }
}

