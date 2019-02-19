package exp.swing.threeCitiesList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class MyList extends JFrame {
    private JList cityList;
    private JLabel cityLabel;

    MyList(String title) {
        super(title);
        this.setDefaultCloseOperation(3);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        this.setSize(200, 200);
        cityLabel = new JLabel("Select a city");
        this.add(cityLabel, BorderLayout.SOUTH);
        String[] cities = {"Wuhan", "Changsha", "Guangzhou"};
        cityList = new JList(cities);
        this.add(cityList);
        cityList.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                cityLabel.setText("" + cityList.getSelectedValue());
            }
        });
    }
}