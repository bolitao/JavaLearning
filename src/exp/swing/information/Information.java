package exp.swing.information;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Information extends JFrame {
    private JTextArea informationTextArea;
    private JTextField nameTextField;
    private JLabel numberLabel;
    private JButton addButton;
    private JRadioButton maleRadioButton, femaleRadioButton;
    private JComboBox provinceComboBox, cityComboBox;
    private JScrollPane scrollPane;
    private int number = 1;
    private String[] province = {"江苏省", "浙江省"};
    private String[][] cities = {{"南京市", "苏州市", "无锡市"}, {"杭州市", "宁波市", "温州市"}};

    Information(String title) {
        super(title);
        this.setLayout(new GridLayout(1, 2));
        informationTextArea = new JTextArea("");
        scrollPane = new JScrollPane(informationTextArea);
        JPanel rightPanel = new JPanel(new GridLayout(6, 1));
        numberLabel = new JLabel();
        numberLabel.setText("" + number);
        nameTextField = new JTextField("Name", 20);
        maleRadioButton = new JRadioButton("Male", true);
        femaleRadioButton = new JRadioButton("Female");
        ButtonGroup sexGroup = new ButtonGroup();
        sexGroup.add(maleRadioButton);
        sexGroup.add(femaleRadioButton);
        JPanel sexPanel = new JPanel(new GridLayout(1, 2));
        provinceComboBox = new JComboBox(province);
        provinceComboBox.setEditable(true);
        cityComboBox = new JComboBox(cities[0]);
        addButton = new JButton("Add");
        this.add(scrollPane);
        this.add(rightPanel);
        rightPanel.add(numberLabel);
        rightPanel.add(nameTextField);
        sexPanel.add(maleRadioButton);
        sexPanel.add(femaleRadioButton);
        rightPanel.add(sexPanel);
        rightPanel.add(provinceComboBox);
        rightPanel.add(cityComboBox);
        rightPanel.add(addButton);
        this.pack();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inforStr, sexStr;
                if (maleRadioButton.isSelected()) {
                    sexStr = maleRadioButton.getText();
                } else {
                    sexStr = femaleRadioButton.getText();
                }
                inforStr = numberLabel.getText() + " " + nameTextField.getText() + " " + sexStr
                        + " " + provinceComboBox.getSelectedItem()
                        + " " + cityComboBox.getSelectedItem();
                informationTextArea.append("\n" + inforStr);
                numberLabel.setText("" + ++number);
            }
        });

        provinceComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int index = provinceComboBox.getSelectedIndex();
                //如果选中的索引不为 -1，即省份下拉框选择的是 province[] 数组的省份时正常处理，否则就把城市下拉框清空
                if (index != -1) {
                    cityComboBox.removeAllItems();
                    for (int i = 0; i < cities[index].length; i++) {
                        cityComboBox.addItem(cities[index][i]);
                    }
                } else {
                    cityComboBox.removeAllItems();
                    cityComboBox.addItem("");
                }
            }
        });
    }
}