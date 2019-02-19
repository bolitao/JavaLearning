package exp.swing.RMBTransform;

import javax.swing.*;

public class ErrorMessageDialog extends JDialog {
    private JFrame superFrame;
    private JLabel errorMessageLabel;

    ErrorMessageDialog(JFrame superFrame) {
        this.superFrame = superFrame;
        errorMessageLabel = new JLabel();
        this.add(errorMessageLabel);
        this.setSize(300, 100);
        this.setDefaultCloseOperation(1);
    }

    public void show(String str) {
        errorMessageLabel.setText("Can't transform " + str + " to Chinese.");
        this.setLocation(superFrame.getX() + 100, superFrame.getY() + 100);
        this.setVisible(true);
    }
}
