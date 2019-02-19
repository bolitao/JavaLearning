package exp.cap12.exp67;

import javax.swing.*;
import java.awt.*;

public class PasswordWindow extends JFrame {
    public static void main(String[] args) {
        PasswordWindow frm = new PasswordWindow();
        frm.setSize(300, 200);
        frm.setTitle("Password auth");
        frm.getContentPane().setBackground(new Color(200, 200, 255));
        frm.setLayout(null);
        JLabel l1 = new JLabel("ID:");
        l1.setBounds(40, 50, 55, 20);
        JTextField t1 = new JTextField(50);
        t1.setBounds(100, 50, 100, 20);
        JLabel l2 = new JLabel("Passwd:");
        l2.setBounds(40, 80, 55, 20);
        JPasswordField t2 = new JPasswordField();
        //有单独的一个 JPasswordField 组件来设置密码框，可使用 setEchoChar() 方法设置其回显字符
        //JPasswordField 继承于 JTextField
        //JFrame 没有 setEchoChar() 方法，而 Frame 所有对象都有 setEchoChar() 方法
        JTextField t = new JTextField();
        t2.setEchoChar('*');
        t2.setBounds(100, 80, 100, 20);
        JButton btn = new JButton("Confirm");
        btn.setBounds(70, 110, 100, 30);
        frm.add(t1);
        frm.add(l1);
        frm.add(t2);
        frm.add(l2);
        frm.add(btn);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }
}
