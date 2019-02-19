package study.capsix;

import javax.swing.plaf.ColorUIResource;
import java.awt.*;

public class LoginFrame extends Frame {
    public LoginFrame() {
        super("User Login");
        this.setSize(300, 200);
        this.setLocation(300, 240);
        this.setBackground(ColorUIResource.WHITE);
        this.setLayout(new BorderLayout());
        this.add(new Button("NORTH"), BorderLayout.NORTH);
        this.add(new Button("SOUTH"), BorderLayout.SOUTH);
        this.add(new Button("WEST"), BorderLayout.WEST);
        this.add(new Button("EAST"), BorderLayout.EAST);
        this.add(new Button("CENTER"), BorderLayout.CENTER);
    }
}