package Application_Chapter_1;

import java.awt.*;
import java.awt.event.*;

public class study extends Frame{
    private Label ib;
    public static void main(String[] args) {
        study st = new study();
    }

    public study() {
        super("A");
        ib = new Label("hello");
        add(ib);

        ib.setForeground(Color.blue);
        ib.setFont(new Font("Serif", Font.BOLD, 24));

        setSize(250, 200);
        setVisible(true);
    }

    class studyWindowListener extends WindowAdapter {
        public void WindowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
} 
