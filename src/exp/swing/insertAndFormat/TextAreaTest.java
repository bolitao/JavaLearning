package exp.swing.insertAndFormat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextAreaTest extends JFrame {
    public static final int DEPTH = 300;
    public static final int HEIGHT = 300;

    private JButton insertButton, wrapButton;
    private JPanel buttonPanel;
    private JScrollPane scrollPane;
    private JTextArea textArea;

    public TextAreaTest() {
        this.setTitle("TextAreaTest");
        this.setSize(DEPTH, HEIGHT);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        textArea = new JTextArea();
        insertButton = new JButton("Insert");
        insertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("The quick brown fox jumps over the lazy dog.");
            }
        });
        wrapButton = new JButton("Wrap");
        wrapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isWrap = textArea.getLineWrap();
                textArea.setLineWrap(!isWrap);
                wrapButton.setText(isWrap ? "Wrap" : "No warp");
            }
        });
        buttonPanel = new JPanel();
        scrollPane = new JScrollPane(textArea);
        buttonPanel.add(insertButton);
        buttonPanel.add(wrapButton);
        this.add(buttonPanel, BorderLayout.SOUTH);
        this.add(scrollPane, BorderLayout.CENTER);
    }
}
