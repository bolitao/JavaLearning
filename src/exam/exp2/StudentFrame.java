package exam.exp2;

import javax.swing.*;
import java.awt.*;

public class StudentFrame extends JFrame {
    JButton saveButton;
    JLabel[] nameLabel, idLabel;
    JTextField[] nameText, idText;
    JPanel[] jPanels;


    StudentFrame() {
    }

    void initFrame() {
        this.setTitle("学生信息输入");
        this.setLayout(new GridLayout(5, 1));
    }
}
