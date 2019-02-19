package exp.cap14.exp75;

import javax.swing.*;

public class LineTest {
    public static void main(String[] args) {
        PaintLine pl = new PaintLine("Paint line");
        pl.setSize(300, 200);
        pl.setVisible(true);
        pl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pl.init();
    }
}
