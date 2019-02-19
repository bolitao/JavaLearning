package study.Swing.JOptionPaneTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloFrame extends JFrame {
    private JButton button;
    private JLabel jLabel;
    private JColorChooser jColorChooser;

    public HelloFrame() {
        super("Test");
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        jLabel = new JLabel("");
        button = new JButton("Password");
        jColorChooser = new JColorChooser();
//        this.add(jColorChooser);
        Color c = JColorChooser.showDialog(HelloFrame.this, "Select Color", Color.BLACK);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tmp = JOptionPane.showInputDialog(HelloFrame.this, "Please enter your password:");
                jLabel.setText("Password: " + tmp);

            }
        });
        this.add(jLabel);
        this.add(button);
        this.setSize(300, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new HelloFrame();
    }

}
