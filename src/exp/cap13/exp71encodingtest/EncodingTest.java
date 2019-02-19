package exp.cap13.exp71encodingtest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EncodingTest extends JFrame {
    private JTextField jTextField;
    private JButton jButton;
    private JTextArea allText;

    EncodingTest() {
        super("EncodingTest");
        init();
        this.pack();
    }

    void init() {
        this.setLayout(new GridLayout(3, 1));
        allText = new JTextArea();
        this.add(allText);
        jTextField = new JTextField();
        this.add(jTextField);
        jButton = new JButton("Add");
        this.add(jButton);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                allText.setText(jTextField.getText());
            }
        });
    }

    public static void main(String[] args) {
        EncodingTest encodingTest = new EncodingTest();
        encodingTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        encodingTest.setVisible(true);
    }
}
