package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    JFrame frame=new JFrame("OptionPane");
    JOptionPane.showMessageDialog(frame,"Hello");
    JOptionPane.showMessageDialog(frame,"Message","Warning",JOptionPane.WARNING_MESSAGE);

    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
    }
}
