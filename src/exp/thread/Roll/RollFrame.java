package exp.thread.Roll;

//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyAdapter;
//import java.awt.event.KeyEvent;
//
//public class RollFrame extends JFrame {
//    private JTextField rollTextField, threadSleepTextField;
//    private JButton startButton, endButton;
//    private JLabel statusLabel;
//    /**
//     * left: 0
//     * right: 1
//     */
//    private int keyStatus;
//    private int sleepTime = 100;
//
//    RollFrame(String title) {
//        super(title);
//        initFrame();
//        initRollField();
//        initControlPanel();
//        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        this.setVisible(true);
//        this.pack();
//    }
//
//    void initFrame() {
//        this.setLayout(new GridLayout(2, 1));
//        this.addKeyListener(new KeyAdapter() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
//                    keyStatus = 0;
//                } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
//                    keyStatus = 1;
//                }
//            }
//        });
//    }
//
//    void initRollField() {
//        rollTextField = new JTextField(String.format("%85s", "Hello"), 10);
//        rollTextField.setEditable(false);
//        this.add(rollTextField);
//    }
//
//    void initControlPanel() {
//        threadSleepTextField = new JTextField("" + sleepTime, 5);
//        startButton = new JButton("Start");
//        endButton = new JButton("End");
//        endButton.setEnabled(false);
//        statusLabel = new JLabel("Status: INTERRUPTED     ");
//        JPanel jPanel = new JPanel(new FlowLayout());
//        jPanel.add(threadSleepTextField);
//        jPanel.add(startButton);
//        jPanel.add(endButton);
//        jPanel.add(statusLabel);
//        this.add(jPanel);
//
//        threadSleepTextField.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                sleepTime = Integer.parseInt(threadSleepTextField.getText());
//            }
//        });
//
//        startButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                RollThread rollThread = new RollThread();
//                rollThread.start();
//                statusLabel.setText("" + rollThread.getState());
//                startButton.setEnabled(false);
//                endButton.setEnabled(true);
//            }
//        });
//
//        endButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                RollThread.interrupted();
//                startButton.setEnabled(true);
//                endButton.setEnabled(false);
//            }
//        });
//    }
//
//    class RollThread extends Thread {
//        @Override
//        public void run() {
//            try {
//                while (true) {
//                    String currentString;
//                    String preString = rollTextField.getText();
//                    if (keyStatus == 0) {
//                        currentString = preString.substring(1) + preString.substring(0, 1);
//                    } else {
//                        currentString = preString.substring(0, preString.length() - 1) + preString.substring(preString.length());
//                    }
//                    rollTextField.setText(currentString);
//                    Thread.sleep(sleepTime);
//                }
//            } catch (InterruptedException e) {
//                System.out.println(e);
//                System.out.println("Program exited.");
//            }
//        }
//    }
//}

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RollFrame extends JFrame {
    JTextField rollText, speedText;
    JButton startButton, endButton;
    JLabel statusLabel;
    JPanel controlPanel;
    int sleepTime = 100;

    RollFrame() {
        initFrame();
    }

    void initFrame() {
        this.setTitle("Rolling");
        this.setSize(330, 110);
        this.setLayout(new GridLayout(2, 1));
//        rollText = new JTextField(String.format("%85s", "Hello"), 10);
//        rollText = new JTextField("Hello", 30);
        rollText = new JTextField("Hello", 10);
        rollText.setEditable(false);
        speedText = new JTextField("" + sleepTime, 5);
        startButton = new JButton("Start");
        startButton.setEnabled(true);
        endButton = new JButton("End");
        endButton.setEnabled(false);
        statusLabel = new JLabel("Not running");
        this.add(rollText);
        controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        controlPanel.add(speedText);
        controlPanel.add(startButton);
        controlPanel.add(endButton);
        controlPanel.add(statusLabel);
        this.add(controlPanel);

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(false);
                endButton.setEnabled(true);
                RollThread thread = new RollThread();
                thread.start();
            }
        });

        endButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startButton.setEnabled(true);
                endButton.setEnabled(false);
            }
        });
    }

    class RollThread extends Thread {
        @Override
        public void run() {

        }
    }
}