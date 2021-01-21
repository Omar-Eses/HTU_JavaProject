package com.Assignment.Paradigms.EDP;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Swing {
    public static void main(String[] args) {
        JFrame frmMain = new JFrame("Where LUCK gives MONEY");
        frmMain.setSize(335, 350);
        frmMain.setLocationRelativeTo(null);

        frmMain.setLayout(new FlowLayout(15));

        JTextField txtName = new JTextField();

        txtName.setPreferredSize(new Dimension(140, 30));

        JLabel lblMsg = new JLabel();
        JButton btnLetGo=new JButton("Let's Go");//this will show next buttons
        JButton btnGiveMny= new JButton("\t\t\t\t\t\t BET on your LUCK \t\t\t\t\t\t");

        btnLetGo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              String name = txtName.getText();
              JOptionPane.showMessageDialog(null, "Hmmm, is it your LUCKY day mr. "+name+"?");
              btnGiveMny.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      Random rndm = new Random();
                      boolean value = rndm.nextBoolean();
                      System.out.println("Value is: " + value);//to show the value
                      //make random numbers (boolean-whether true or wrong-)if this value==1 show you can take the money
                      if (value==true){
                          frmMain.add(btnGiveMny);
                          JOptionPane.showMessageDialog(null, "WOW, you are LUCKY "+name+"!");
                      }
                      //if value==0 show oooh, better luck next time
                      if (value==false) {
                          JOptionPane.showMessageDialog(null, "oops, try again later mr. "+name+"!");
                      }
                  }
              });

                frmMain.add(lblMsg);
                frmMain.add(btnGiveMny);
                frmMain.setVisible(true);
            }
        });
        JLabel lblName = new JLabel("Your Name");

        frmMain.add(lblName);
        frmMain.add(txtName);
        frmMain.add(btnLetGo);
        frmMain.setVisible(true);
    }
}
