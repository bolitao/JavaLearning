package exp.cap13.exp70;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window2 {
    JFrame f;
    JLabel lab;

    public void display() {
        f = new JFrame("WindowEvent 2");
        f.setSize(300, 200);
        f.setLayout(null);
        lab = new JLabel("Get focus");
        lab.setBounds(20, 20, 80, 20);
        f.add(lab);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowActivated(WindowEvent e) {
                lab.setText("Get focus");
            }

            @Override
            public void windowDeactivated(WindowEvent e) {
                lab.setText("Lost focus");
            }
        });
//        f.setDefaultCloseOperation(3);
        f.setVisible(true);
    }
}
