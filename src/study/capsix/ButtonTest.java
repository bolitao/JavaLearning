package study.capsix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTest implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Action occurred");
    }

    public void display() {
        JFrame f = new JFrame("Test");
        JButton b = new JButton("Press me!");
        f.setLayout(new FlowLayout());
        b.addActionListener(this);
        f.add(b);
        f.setSize(200, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(3);
    }

    public static void main(String[] args) {
        (new ButtonTest()).display();
    }
}
