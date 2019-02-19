package exp.cap12.exp64;

import javax.swing.*;
import java.awt.*;

public class MyFlowLayout extends JFrame {
    public MyFlowLayout(String title) {
        this.setTitle(title);
    }

    public static void main(String[] args) {
        MyFlowLayout frm = new MyFlowLayout("MyFlowlayout");
        FlowLayout flow = new FlowLayout(1);
        JButton b0 = new JButton("First button");
        JButton b1 = new JButton("Secont button");
        JButton b2 = new JButton("Third button");
        frm.setLayout(flow);
        frm.setSize(200, 150);
        frm.setLocation(500, 500);
        frm.getContentPane().setBackground(Color.YELLOW);
        frm.add(b0);
        frm.add(b1);
        frm.add(b2);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
