package study.capsix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonTestStatic {
    public static void main(String[] args) {
        JFrame f = new JFrame("Test");
        JButton b = new JButton("PRESS ME!");
        ButtonHandler buttonHandler = new ButtonHandler();
        b.addActionListener(buttonHandler);
        f.setLayout(new FlowLayout());
        f.add(b);
        f.setSize(200, 100);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    static class ButtonHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("Action occurred.");
        }
    }
}
