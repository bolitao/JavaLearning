package exp.cap14.exp76;

import javax.swing.*;

public class PrintShape extends JFrame {
    PrintShape(String title) {
        super(title);
        this.setSize(300, 200);
        JPanel jPanel = new MyPanel();
        this.add(jPanel);
        jPanel.setBounds(0, 0, 300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
