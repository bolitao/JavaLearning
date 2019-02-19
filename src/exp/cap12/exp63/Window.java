package exp.cap12.exp63;

import javax.swing.*;
import java.awt.*;

class Window {
    public static void main(String args[]) {
        JFrame frm = new JFrame();
        frm.setSize(300, 200);
        frm.setTitle("My window");
        frm.getContentPane().setBackground(Color.WHITE);
        //JFrame 组件设置背景颜色的方法和 Frame 稍有差异，JFrame 创建时就已有一个 ContentPanel
        //若直接设置背景色会被 ContentPanel 遮盖，所以给 ContentPanel 设置背景色才有效
        frm.setLocation(200, 200);
        JButton b = new JButton("Confirm");
        frm.add(b);
        frm.setDefaultCloseOperation(3);
        //setDefaultCloseOperation 方法用于设置用户点击关闭按钮时执行的操作
        //3 等同于 JFrame.EXIT_ON_CLOSE
        //0: DO_NOTHING_ON_CLOSE
        //1: HIDE_ON_CLOSE
        //2: DISPOSE_ON_CLOSE
        frm.setVisible(true);
    }
}