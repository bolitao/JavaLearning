package exp.swing.editor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A simple editor example
 *
 * @author Boli Tao
 * @date 2018/6/1
 */

public class Editor extends JFrame {
    private JMenuBar jMenuBar;
    private JToolBar jToolBar;
    private JMenu fileMenu, editMenu, helpMenu, fontMenu, colorMenu;
    private JMenuItem openJMenuItem, saveJMenuItem, exitJMenuItem, copyJMenuItem, pasteJMenuItem, cutJMenuItem,
            helpJMenuItem, aboutJMenuItem, textAreaQuitJMenuItem;
    private JRadioButtonMenuItem redJRadioButtonMenuItem, blackJRadioButtonMenuItem, greenJRadioButtonMenuItem;
    private JCheckBoxMenuItem italicJCheckBoxMenuItem, boldJCheckBoxMenuItem;
    private JPopupMenu textAreaPopupMenu;
    private JTextArea editArea;
    private QuitAction quitAction;
    private JComboBox fontJComboBox, fontSizeJComboBox;
    private JRadioButton redRadioButton, greenRadioButton, blackRadioButton, customColorRadioButton;
    private JCheckBox italicCheckBox, boldCheckBox;
    private AbstractAction italicAbstractAction, boldAbstractAction, redAbstractAction, greenAbstractAction,
            customColorAbstractAction, blackAbstractAction;
    private JRadioButtonMenuItem customColorRadioButtonMenuItem;
    private static Integer size[] = {10, 20, 30, 40, 50, 60, 70};

    Editor() {
        super("Editor");
        quitAction = new QuitAction();
        this.setLayout(new BorderLayout());
        this.setSize(800, 600);
        initAction();
        initMenu();
        initToolBar();
        initTextArea();
    }

    void initTextArea() {
        editArea = new JTextArea();
        this.add(new JScrollPane(editArea));
        textAreaPopupMenu = new JPopupMenu();
        editArea.setComponentPopupMenu(textAreaPopupMenu);
        copyJMenuItem = new JMenuItem("Copy");
        pasteJMenuItem = new JMenuItem("Paste");
        cutJMenuItem = new JMenuItem("Cut");
        textAreaQuitJMenuItem = new JMenuItem(quitAction);
        textAreaPopupMenu.add(copyJMenuItem);
        textAreaPopupMenu.add(cutJMenuItem);
        textAreaPopupMenu.add(pasteJMenuItem);
        textAreaPopupMenu.addSeparator();
        textAreaPopupMenu.add(textAreaQuitJMenuItem);

        //CTRL_MASK 已不建议使用，建议使用 CTRL_DOWN_MASK
        copyJMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
        pasteJMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
        cutJMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
        openJMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        saveJMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));

        copyJMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editArea.copy();
            }
        });

        pasteJMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editArea.paste();
            }
        });

        cutJMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editArea.cut();
            }
        });
    }

    void initMenu() {
        jMenuBar = new JMenuBar();
        this.setJMenuBar(jMenuBar);
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        openJMenuItem = new JMenuItem("Open");
        saveJMenuItem = new JMenuItem("Save");
        exitJMenuItem = new JMenuItem(quitAction);
        editMenu = new JMenu("Edit");
        fontMenu = new JMenu("Font");
        colorMenu = new JMenu("Color");
        helpMenu = new JMenu("Help");
        redJRadioButtonMenuItem = new JRadioButtonMenuItem(redAbstractAction);
        greenJRadioButtonMenuItem = new JRadioButtonMenuItem(greenAbstractAction);
        blackJRadioButtonMenuItem = new JRadioButtonMenuItem(blackAbstractAction);
        blackJRadioButtonMenuItem.setSelected(true);
        italicJCheckBoxMenuItem = new JCheckBoxMenuItem(italicAbstractAction);
        boldJCheckBoxMenuItem = new JCheckBoxMenuItem(boldAbstractAction);
        helpJMenuItem = new JMenuItem("Usage");
        aboutJMenuItem = new JMenuItem("About");
        customColorRadioButtonMenuItem = new JRadioButtonMenuItem(customColorAbstractAction);

        fontMenu.add(boldJCheckBoxMenuItem);
        fontMenu.add(italicJCheckBoxMenuItem);
        ButtonGroup menuColorGroup = new ButtonGroup();
        menuColorGroup.add(redJRadioButtonMenuItem);
        menuColorGroup.add(blackJRadioButtonMenuItem);
        menuColorGroup.add(greenJRadioButtonMenuItem);
        menuColorGroup.add(customColorRadioButtonMenuItem);
        colorMenu.add(redJRadioButtonMenuItem);
        colorMenu.add(greenJRadioButtonMenuItem);
        colorMenu.add(blackJRadioButtonMenuItem);
        colorMenu.addSeparator();
        colorMenu.add(customColorRadioButtonMenuItem);
        jMenuBar.add(fileMenu);
        jMenuBar.add(editMenu);
        fileMenu.add(openJMenuItem);
        fileMenu.add(saveJMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(exitJMenuItem);
        editMenu.add(fontMenu);
        editMenu.add(colorMenu);
        jMenuBar.add(helpMenu);
        helpMenu.add(helpJMenuItem);
        helpMenu.add(aboutJMenuItem);

        helpJMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Editor.this, "Hello world!", "Help", JOptionPane.PLAIN_MESSAGE);
            }
        });

        aboutJMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(Editor.this, "Version: 0.01\nAuthor: Boli Tao\n" +
                        "Email: tblsyx@outlook.com\nWebsite: https://www.bolitao.xyz", "About", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        customColorRadioButtonMenuItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    void initToolBar() {
        jToolBar = new JToolBar();
        this.add(jToolBar, BorderLayout.NORTH);
        fontSizeJComboBox = new JComboBox();
        italicCheckBox = new JCheckBox(italicAbstractAction);
        boldCheckBox = new JCheckBox(boldAbstractAction);
        redRadioButton = new JRadioButton(redAbstractAction);
        greenRadioButton = new JRadioButton(greenAbstractAction);
        blackRadioButton = new JRadioButton(blackAbstractAction);
        customColorRadioButton = new JRadioButton(customColorAbstractAction);
        ButtonGroup toolbarColorGroup = new ButtonGroup();
        toolbarColorGroup.add(redRadioButton);
        toolbarColorGroup.add(greenRadioButton);
        toolbarColorGroup.add(blackRadioButton);
        toolbarColorGroup.add(customColorRadioButton);
        GraphicsEnvironment graphicsEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontName = graphicsEnvironment.getAvailableFontFamilyNames();
        fontJComboBox = new JComboBox(fontName);
        //TODO: fine a better way to change font size
        fontSizeJComboBox = new JComboBox(size);
        fontSizeJComboBox.setEditable(true);

        jToolBar.add(fontJComboBox);
        jToolBar.add(fontSizeJComboBox);
        jToolBar.add(boldCheckBox);
        jToolBar.add(italicCheckBox);
        jToolBar.add(redRadioButton);
        jToolBar.add(greenRadioButton);
        jToolBar.add(blackRadioButton);
        jToolBar.add(customColorRadioButton);

        fontJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                Font font = editArea.getFont();
                Font newFont = font.decode((String) fontJComboBox.getSelectedItem());
                editArea.setFont(newFont);
//                Font oldFont = editArea.getFont();
//                Font newFont = oldFont.decode((String) fontJComboBox.getSelectedItem());
//                editArea.setFont(newFont);
            }
        });

        fontSizeJComboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
//                Font oldFont = editArea.getFont();
//                Font newFont = oldFont.decode((String)fontSizeJComboBox.getSelectedItem());
//                editArea.setFont(newFont);
                Font font = editArea.getFont();
                int fontSize = (int) fontSizeJComboBox.getSelectedItem();
//                float fontSize = (float)oldFont.getSize()
                font = font.deriveFont((float) fontSize);
                editArea.setFont(font);
            }
        });
    }

    void initAction() {
        boldAbstractAction = new AbstractAction("Bold") {
            boolean isBold = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = editArea.getFont();
                int style = font.getStyle();
                style = style ^ 1;
                font = font.deriveFont(style);
                editArea.setFont(font);
                isBold = !isBold;
                putValue(SELECTED_KEY, isBold);
            }
        };

        italicAbstractAction = new AbstractAction("Italic") {
            private boolean isItalic = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                Font font = editArea.getFont();
                int style = font.getStyle();
                style = style ^ 2;
                font = font.deriveFont(style);
                editArea.setFont(font);
                isItalic = !isItalic;
                //TODO: comprehend isItalic and isBold
                putValue(SELECTED_KEY, isItalic);
            }
        };

        redAbstractAction = new AbstractAction("Red") {
            @Override
            public void actionPerformed(ActionEvent e) {
                editArea.setForeground(Color.RED);
                putValue(SELECTED_KEY, true);
            }
        };

        greenAbstractAction = new AbstractAction("Green") {
            @Override
            public void actionPerformed(ActionEvent e) {
                editArea.setForeground(Color.GREEN);
                putValue(SELECTED_KEY, true);
            }
        };

        blackAbstractAction = new AbstractAction("Black") {
            @Override
            public void actionPerformed(ActionEvent e) {
                editArea.setForeground(Color.BLACK);
//                putValue();
                putValue(SELECTED_KEY, true);
            }
        };

        customColorAbstractAction = new AbstractAction("Custom color") {
            @Override
            public void actionPerformed(ActionEvent e) {
                java.awt.Color customColor = JColorChooser.showDialog(Editor.this, "Choose color", java.awt.Color.BLACK);
                editArea.setForeground(customColor);
                putValue(SELECTED_KEY, true);
            }
        };
    }

    /**
     * 写成内部类的例子
     * 也可以用 AbstractAction，见 initAction()
     *
     * @date 2018/6/1
     */
    private class QuitAction extends AbstractAction {
        public QuitAction() {
            super("Quit");
            //TODO: Comprehend the specific meaning of putValue()
            putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_DOWN_MASK));
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            int tmp = JOptionPane.showConfirmDialog(Editor.this, "Sure to quit?", "Confirm",
                    JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
            if (tmp == 0) {
//                System.exit(0);
                System.exit(0);
            }
        }
    }
}

//TODO: open and save operation