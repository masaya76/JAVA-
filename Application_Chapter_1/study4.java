package Application_Chapter_1;

import java.awt.*;
import java.awt.event.*;

public class study4 extends Frame {
  Image im;

  public static void main(String[] args) {
    study4 st = new study4();
  }

  public study4() {
    super("title");

    Toolkit tk = getToolkit();
    im = tk.getImage("Image.jpg");

    addWindowListener(new a());

    setSize(250, 200);
    setVisible(true);
  }

  public void paint(Graphics g) {
    g.drawImage(im, 100, 100, this);
  }

  public class a extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      System.exit(0);
    }
  }
}
