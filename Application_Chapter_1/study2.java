package Application_Chapter_1;

import java.awt.*;
import java.awt.event.*;

public class study2 extends Frame {

    private Button bt;

    public static void main(String[] args) {
        study2 st = new study2();
    }

    public study2() {
        super("sample");

        bt = new Button("welcome");
        add(bt);

        addWindowFocusListener(new a());
        bt.addActionListener(new b());

        setSize(250, 200);
        setVisible(true);
    }

    public class a extends WindowAdapter {
        public void windowClose(WindowEvent e) {
            System.exit(0);
        }
    }

    public class b implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            bt.setLabel("hello");
        }
    }
}
