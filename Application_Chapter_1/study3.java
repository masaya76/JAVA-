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
        
    }
}
