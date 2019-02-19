package exp.cap14.exp77;

import java.awt.*;

public class MyOval {
    private int x, y;
    private int width, height;

    public MyOval(int newX, int newY, int newWidth, int newHeight) {
        x = newX;
        y = newY;
        width = newWidth;
        height = newHeight;
    }

    public void drawMe(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}
