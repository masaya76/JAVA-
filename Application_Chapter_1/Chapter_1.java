package Application_Chapter_1;

import java.awt.*;
import java.awt.event.*;

public class Chapter_1 extends Frame {
    public static void main(String[] args) {
        Chapter_1 ch = new Chapter_1();
    }

    public Chapter_1() {
        super("sample");
        addWindowListener(new SampleWindowListenere());

        setSize(250, 200);
        setVisible(true);
    }

    class SampleWindowListenere extends WindowAdapter {
        public void windowwClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}
