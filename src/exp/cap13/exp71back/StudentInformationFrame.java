package exp.cap13.exp71back;

import javax.swing.*;
import java.awt.*;

public class StudentInformationFrame extends JFrame {
    private JList informationList;
    private JTextField idJTextField, nameJTextField;
    private JRadioButton maleJRadioButton, femaleJRadioButton;
    private JComboBox departmentJComboBox, majorjComboBox;
    private JButton addJButton, deleteJButton;
    private JPanel leftPanel, rightPanel, buttonPanel;

    StudentInformationFrame(String title) {
        super(title);
        init();
    }

    void init() {
        this.setLayout(new GridLayout(1, 2));
        informationList = new JList();
    }
}
