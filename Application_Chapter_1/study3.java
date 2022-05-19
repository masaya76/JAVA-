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

        bt = new Button("hello");
        add(bt);

        addWindowListener(new a());
        bt.addMouseListener(new b());

        setSize(250,200);
        setVisible(true);
    }

    public class a extends WindowAdapter {
        public void WindowClosing(WindowEvent e) {
          System.exit(0);
        }
    }

    public class  b implements MouseListener {
        public void mouseClicked(MouseEvent e) {}
        public void mouseReleased(MouseEvent e) {} 
        public void mousePressed(MouseEvent e) {}
        public void mouseEntered(MouseEvent e) {
            bt.setLabel("welcome");
        }
        public void mouseExited(MouseEvent e) {
            bt.setLabel("good morning");
        }
    }
}
