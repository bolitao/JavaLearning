package exp.cap12.exp66;

import javax.swing.*;
import java.awt.*;

public class MyGridLayout {
    public static void main(String args[]) {
        JFrame frm = new JFrame("GirdLayout");
        frm.setSize(300, 200);
        GridLayout grid = new GridLayout(3, 3);
        frm.setLayout(grid);
        JButton[] b = new JButton[9];
        for (int i = 0; i < b.length; i++) {
            b[i] = new JButton(i + 1 + "");
            frm.add(b[i]);
        }
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}