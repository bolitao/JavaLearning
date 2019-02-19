package study.Swing.JToolBar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JToolBarTest extends JFrame {
    private JRadioButton blackJRadioButton, redJRadioButton;
    private JToolBar jToolBar;
    private JTextArea jTextField;

    JToolBarTest() {
        super("JToolBar test");
        this.setSize(300, 300);
        init();
    }

    void init() {
        blackJRadioButton = new JRadioButton("Black");
        redJRadioButton = new JRadioButton("Red");
        jTextField = new JTextArea();
        jToolBar = new JToolBar("JToolBar", SwingConstants.HORIZONTAL);
        ButtonGroup colorButtonGroup = new ButtonGroup();
        colorButtonGroup.add(redJRadioButton);
        colorButtonGroup.add(blackJRadioButton);
        jToolBar.add(redJRadioButton);
        jToolBar.add(blackJRadioButton);
        this.add(new JScrollPane(jTextField));
        this.add(jToolBar, BorderLayout.NORTH);

        redJRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.red);
            }
        });

        blackJRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jTextField.setForeground(Color.black);
            }
        });
    }


    public static void main(String[] args) {
        JToolBarTest test = new JToolBarTest();
        test.setVisible(true);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
