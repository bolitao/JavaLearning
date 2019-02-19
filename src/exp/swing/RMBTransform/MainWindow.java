package exp.swing.RMBTransform;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;

/**
 * Class MainWindow: A window to transform RBM to Chinese
 *
 * @author Boli Tao
 * @date 2018/5/26
 */

public class MainWindow extends JFrame {
    private JLabel moneyLabel, resultLabel;
    private JTextField moneyTextField, resultTextField;
    private ErrorMessageDialog errorMessageDialog;


    MainWindow() {
        super("RMBTransform");
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setSize(300, 90);
        moneyLabel = new JLabel("RMB");
        resultLabel = new JLabel("Result");
        moneyTextField = new JTextField("12345678.90", 20);
        resultTextField = new JTextField(20);
        errorMessageDialog = new ErrorMessageDialog(this);
        resultTextField.setEditable(false);
        this.add(moneyLabel);
        this.add(moneyTextField);
        this.add(resultLabel);
        this.add(resultTextField);

        moneyTextField.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                String moneyText = moneyTextField.getText();
                try {
                    double moneyTmp = Double.parseDouble(moneyText);
                    resultTextField.setText(rmbToChinese(moneyTmp));
                } catch (NumberFormatException nfe) {
                    errorMessageDialog.show(moneyText);
                }

            }
        });
    }

    public static String rmbToChinese(double money) {
        String yuan = "亿千百拾万千百拾元角分";
        String digit = "零壹贰叁肆伍陆柒捌玖";

        String result = "";
        int y = (int) Math.round(money * 100 - 0.5);
        int i = yuan.length() - 1;
        while (y > 0 && i > 0) {
            result = "" + digit.charAt(y % 10) + yuan.charAt(i) + result;
            i--;
            y = y / 10;
        }
        return result;
    }
}

//TODO: rmbToChinese method