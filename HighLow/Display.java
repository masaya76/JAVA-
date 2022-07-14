package HighLow;

import java.awt.Color;
import java.awt.Font;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class Display {
    private JFrame disp;
    private JPanel top_panel, mid_panel, bottom_panel;
    private JLabel msg_lbl;
    private JLabel parent_lbl, parent_suit_lbl, parent_no_lbl;
    private JLabel child_lbl, child_suit_lbl, child_no_lbl;
    private JButton btn_high, btn_low;
    private Player parent, child;

    public Display(Player prn, Player chl){
        parent = prn;
        child = chl;

        disp = new JFrame("High & Low");
        disp.setSize(480, 280);
        disp.setLocationRelativeTo(null);
        disp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        disp.setResizable(false);

        top_panel = new JPanel();
        setPanel(top_panel, Color.ORANGE, null, new Dimension(480, 50) );
        disp.add(top_panel, BorderLayout.NORTH);

        msg_lbl = new JLabel("One-shot game! Please guess whether it is High or Low");
        top_panel.add(msg_lbl);
        setLabelFont(msg_lbl, Color.BLACK, 0, 15, 480, 20, 20, false);

        mid_panel = new JPanel();
        setPanel(mid_panel, Color.CYAN, null, new Dimension(480,180));
        disp.add(mid_panel, BorderLayout.CENTER);

        parent_lbl = new JLabel("My card");
        parent_suit_lbl = new JLabel(getSuitIcon(parent.GetSuit()));
        parent_no_lbl = new JLabel(getNoStr(parent.GetNo()));
        
        mid_panel.add(parent_lbl);
        mid_panel.add(parent_suit_lbl);
        mid_panel.add(parent_no_lbl);

        setLabelFont(parent_lbl, Color.WHITE, 90, 10, 100, 20, 14, false);
        setLabelFont(parent_suit_lbl, Color.WHITE, 100, 10, 80, 100, 16, false); 
        setLabelFont(parent_no_lbl, Color.WHITE, 100, 35, 80, 100, 16, true);

        child_lbl = new JLabel("Your card");
        child_lbl = new JLabel("");
        child_no_lbl = new JLabel(getNoStr(parent.GetNo()));

        mid_panel.add(child_lbl);
        mid_panel.add(child_suit_lbl);
        mid_panel.add(child_no_lbl);

        setLabelFont(child_lbl, Color.WHITE, 265, 10, 150, 20,14, false);
        setLabelFont(child_suit_lbl, Color.LIGHT_GRAY, 300, 10, 80, 100, 16, false);
        setLabelFont(child_no_lbl, Color.LIGHT_GRAY, 300, 35, 80, 100, 16, false);

        bottom_panel = new JPanel();
        setPanel(bottom_panel, Color.LIGHT_GRAY, new BorderLayout(), new Dimension(480, 50));
        disp.add(bottom_panel, BorderLayout.SOUTH);

        btn_high = new JButton("HIGH");
        setButton( btn_high, (ActionListener)this, 240, 50, 20 );
        bottom_panel.add( btn_high, BorderLayout.WEST );

        btn_low = new JButton("LOW");
        setButton( btn_high,  (ActionListener)this, 240, 50, 20 );
        bottom_panel.add(btn_low, BorderLayout.EAST);
        
        disp.setVisible(true);

    }


    


    public static void setPanel(JPanel panel, Color color, BorderLayout layout, Dimension dimension) {
        panel.setBackground(color);
        panel.setLayout(layout);
        panel.setPreferredSize(dimension);

        return;
    }


    public static void setLabelFont(JLabel label, Color clr, int x_pos, int y_pos, int x_size, int y_size, int strSize, boolean opq){
        label.setBackground(clr);
        label.setLocation(x_pos, y_pos);
        label.setSize(x_size, y_size);
        label.setFont(new Font("MS Gothic", Font.PLAIN, strSize));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setOpaque(opq);

        return;
    }


    public static void setButton(JButton btn, ActionListener al, int x_size, int y_size, int strSize ){
        btn.setPreferredSize(new Dimension(x_size, y_size));
        btn.setFont(new Font("MS Gothic", Font.PLAIN, strSize));
        btn.addActionListener(al);

        return;
    }


    public static ImageIcon getSuitIcon(int suit){
        ImageIcon icon;

        switch(suit){
            case 0:
                icon = new ImageIcon("./src/game/highandlow/img/spade.jpg");
                return icon;

            case 1:
                icon = new ImageIcon("./src/game/highandlow/img/heart.jpg");
                return icon;

            case 2:
                icon = new ImageIcon("./src/game/highandlow/img/diamond.jpg");
                return icon;

            case 3:
                icon = new ImageIcon("./src/game/highandlow/img/clover.jpg");
                return icon;

            default:
                return null;
        }
    }

    public static String getNoStr(int no){
        switch(no){
            case 1:
            return "A";

            case 2:
            return "J";

            case 3:
            return "Q";

            case 4:
            return "K";

            default: 
            return String.valueOf(no);
        }
    }

}
