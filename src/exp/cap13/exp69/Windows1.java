package exp.cap13.exp69;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Windows1 {
    JFrame f;
    JLabel lab;

    public void display() {
        f = new JFrame("WindowEvent 1");
        f.setSize(300, 200);
        f.setLayout(null);
        lab = new JLabel("Get focus");
        lab.setBounds(20, 20, 80, 20);
        f.add(lab);
        f.addWindowListener(new WindowListener() {
            @Override
            public void windowOpened(WindowEvent e) {

            }

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }

            @Override
            public void windowClosed(WindowEvent e) {

            }

            @Override
            public void windowIconified(WindowEvent e) {

            }

            @Override
            public void windowDeiconified(WindowEvent e) {

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
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
