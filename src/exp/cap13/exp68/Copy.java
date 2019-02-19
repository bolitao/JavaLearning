package exp.cap13.exp68;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Copy extends JFrame {
    JButton b;
    JTextField l, r;

    Copy() {
        super("Copy");
        this.getContentPane().setBackground(Color.lightGray);
        this.setLayout(new FlowLayout());
        l = new JTextField(10);
        r = new JTextField(10);
        b = new JButton("Copy");
        this.add(l);
        this.add(b);
        this.add(r);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == b) {
                    r.setText(l.getText());
                }
            }
        });
        this.pack();
    }

    public static void main(String[] args) {
        Copy cp = new Copy();
        cp.setDefaultCloseOperation(3);
        cp.setVisible(true);
    }
}