package exp.cap12.exp65;

import javax.swing.*;
import java.awt.*;

public class MyBorderLayout {
    public static void main(String[] args) {
        JFrame frm = new JFrame("BorderLayout");
        BorderLayout border = new BorderLayout(5, 10);
        frm.setLayout(border);
        frm.setSize(280, 200);
        JButton b0 = new JButton("North");
        JButton b1 = new JButton("South");
        JButton b2 = new JButton("West");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("Center");
        frm.add("North", b0);
        frm.add("South", b1);
        frm.add("West", b2);
        frm.add("East", b3);
        frm.add("Center", b4);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
