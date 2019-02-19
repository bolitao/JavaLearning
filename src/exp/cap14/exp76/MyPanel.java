package exp.cap14.exp76;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paintComponents(Graphics g) {
//        Graphics g = PrintShape.this.getGraphics();
        g.setColor(Color.BLACK);
        g.drawRect(50, 50, 50, 50);
        g.fillRect(120, 50, 50, 40);
        g.drawOval(50, 120, 50, 50);
        g.fillOval(120, 120, 50, 50);
    }
}
