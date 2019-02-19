package exp.swing.editor;

import javax.swing.*;

public class EditWindow {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.setVisible(true);
        editor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
