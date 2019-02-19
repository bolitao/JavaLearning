package exp.cap14.exp74;

import javax.swing.*;

public class PaintFont extends JFrame {
    PaintFont() {
        super("Paint font");
        this.setSize(300, 200);
        this.setLayout(null);
        JPanel jPanel = new MyPanel();
        this.add(jPanel);
        jPanel.setBounds(0, 0, 300, 200);
    }
}
