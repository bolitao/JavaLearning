package study.capsix;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiToMulti {
    private JFrame f = new JFrame("Test");
    private JTextArea text = new JTextArea(4, 60);
    private JButton b1 = new JButton("Button 1");
    private JButton b2 = new JButton("Button 2");

    public void init() {
        f.add(text);
        FirstListener fl = new FirstListener();
        b1.addActionListener(fl);
        b1.addActionListener(new SecondListener());
        b2.addActionListener(fl);
        JPanel p = new JPanel();
        p.add(b1);
        p.add(b2);
        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    class FirstListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.append("firstListener ActionListener was triggered, source is "
                    + e.getActionCommand() + "\n");
        }
    }

    class SecondListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            text.append("secondListener ActionListener was triggered, source is "
                    + e.getActionCommand() + "\n");
        }
    }

    public static void main(String[] args) {
        (new MultiToMulti()).init();
    }
}
