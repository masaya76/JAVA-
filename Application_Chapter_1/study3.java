package Application_Chapter_1;

import java.awt.*;
import java.awt.event.*;

public class study3 extends Frame {

    private Button bt;

    public static void main(String[] args) {
        study3 st = new study3();
    }

    public study3() {
        super("sample");

        bt = new Button("welcome");
        add(bt);

        addWindowFocusListener(new studyWindowListener());
        bt.addActionListener(new studyActionListener());

        setSize(250, 200);
        setVisible(true);
    }

    public class studyWindowListener extends WindowAdapter {
        public void windowClose(WindowEvent e) {
            System.exit(0);
        }
    }

    public class studyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bt.setLabel("hello");
        }
    }
}
