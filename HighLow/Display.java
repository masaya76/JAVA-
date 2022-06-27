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
    }

}
