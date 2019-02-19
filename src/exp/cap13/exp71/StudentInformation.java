package exp.cap13.exp71;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * A student information input window
 *
 * @author Boli Tao
 * @date 2018/5/26
 */

class StudentInformation extends JFrame {
    private List informationList;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private ButtonGroup sexButtonGroup;
    private JTextField id;
    private JTextField nameTextField;
    private JComboBox departmentComboBox, majorComboBox;
    private JButton addButton, deleteButton;
    private JPanel rightMainPanel, sexPanel, buttonPanel;
    private String[] departments = {"Computer and Information", "Civil"};
    private String[][] majors = {{"Software Engineering", "Computer Science"},
            {"Civil Engineering", "Engineering Mechanics"}};

    StudentInformation() {
        super("Student information input window");
        this.setLayout(new GridLayout(1, 2));
        informationList = new List();
        this.add(informationList);
        rightMainPanel = new JPanel(new GridLayout(6, 1));
        this.add(rightMainPanel);
        id = new JTextField("20161791");
        rightMainPanel.add(id);
        nameTextField = new JTextField("Name");
        rightMainPanel.add(nameTextField);
        maleRadioButton = new JRadioButton("Male", true);
        femaleRadioButton = new JRadioButton("Female");
        sexButtonGroup = new ButtonGroup();
        sexButtonGroup.add(maleRadioButton);
        sexButtonGroup.add(femaleRadioButton);
        sexPanel = new JPanel(new GridLayout(1, 2));
        sexPanel.add(maleRadioButton);
        sexPanel.add(femaleRadioButton);
        rightMainPanel.add(sexPanel);
        departmentComboBox = new JComboBox(departments);
        rightMainPanel.add(departmentComboBox);
        majorComboBox = new JComboBox(majors[0]);
        rightMainPanel.add(majorComboBox);
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        buttonPanel = new JPanel(new GridLayout(1, 2));
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        rightMainPanel.add(buttonPanel);
        this.pack();

        departmentComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int selectedIndex = departmentComboBox.getSelectedIndex();
                majorComboBox.removeAllItems();
                for (int i = 0; i < majors[selectedIndex].length; i++) {
                    majorComboBox.addItem(majors[selectedIndex][i]);
                }
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String informationString, sexString;
                if (maleRadioButton.isSelected()) {
                    sexString = maleRadioButton.getText();
                } else {
                    sexString = femaleRadioButton.getText();
                }
                informationString = "" + id.getText() + " " + nameTextField.getText() + " " +
                        sexString + " " + departmentComboBox.getSelectedItem() + " " +
                        majorComboBox.getSelectedItem();
                informationList.add(informationString);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectIndex = informationList.getSelectedIndex();
                informationList.remove(selectIndex);
            }
        });
    }
}