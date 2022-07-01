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

    private JLabel msg_lbll;
    private JLabel parent_lbl, parent_suit_lbl, parent_no_lbl;
    private JLabel child_lbl, child_suit_lbl, child_no_lbl;

    private JButton btn_high, btn_Low;

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
        child_lbl = 
    }

    public static void setPanel(JPanel panel, Color color, BorderLayout layout, Dimension dimension) {
        panel.setBackground(color);
        panel.setLayout(layout);
        panel.setPreferredSize(dimension);

        return;
    }

}
