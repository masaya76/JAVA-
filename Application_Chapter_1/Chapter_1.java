package Application_Chapter_1;

import java.awt.*;
import java.awt.event.*;

public class Chapter_1 extends Frame {
    public static void main(String[] args) {
        Chapter_1 ch = new Chapter_1();
    }

    public Chapter_1() {
        super("sample");
        addWindowListener(new ChapterWindowListenere());

        setSize(250, 200);
        setVisible(true);
    }

    class ChapterWindowListenere extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }
}