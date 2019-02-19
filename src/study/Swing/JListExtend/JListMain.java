package study.Swing.JListExtend;

import javax.swing.*;
import java.awt.*;

public class JListMain extends JFrame {
    private final int DEFAULTNUM = 15;
    private JList jList;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JPanel jPanel;
    private DefaultListModel defaultListModel;

    JListMain(String windowName) {
        super(windowName);
        this.init();
        this.setSize(300, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void init() {
        this.setLayout(new BorderLayout());
        defaultListModel = new DefaultListModel();
        jList = new JList(defaultListModel);
        //新建面板并设置对齐方式为左对齐
        jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jTextField = new JTextField(8);
        jButton = new JButton("添加选项");
        jLabel = new JLabel("");
        this.add(jList, BorderLayout.CENTER);
        jPanel.add(jTextField);
        jPanel.add(jButton);
        jPanel.add(jLabel);
        this.add(jPanel, BorderLayout.SOUTH);
        for (int i = 0; i < DEFAULTNUM; i++) {
            defaultListModel.addElement("选项" + i);
        }
    }
}
