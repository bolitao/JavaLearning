package exp.cap14.exp74;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        Font font1 = new Font("宋体", Font.PLAIN, 25);
        g.setFont(font1);
        g.drawString("Java 程序设计", 50, 110);
        g.setColor(Color.BLACK);
        Font font2 = new Font("TimesR", Font.BOLD, 30);
        g.setFont(font2);
        g.drawString("JJAAVVAA", 50, 140);
    }
}
