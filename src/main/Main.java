package main;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

    JFrame frame=new JFrame("OptionPane");
    JOptionPane.showMessageDialog(frame,"Message");
    JOptionPane.showMessageDialog(frame,"Warning","Warning",JOptionPane.WARNING_MESSAGE);
    JLabel label=new JLabel("Text ====> ");
    label.setBounds(10,10,1000,20);

    String str=JOptionPane.showInputDialog(frame,"Enter Text");
    label.setText(label.getText()+str);
    frame.setSize(400,400);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.add(label);
    }
}
