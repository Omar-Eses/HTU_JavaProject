package com.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GPA {//this program will calculate GPA
    public static void main(String[] args) {
        JFrame frmMain= new JFrame("GPA calculator");//program name
        frmMain.setSize(450, 600);//size of program
        frmMain.setLocationRelativeTo(null);//center window on the screen
        frmMain.setLayout(new FlowLayout(20));//layout to over default

        //Grades
        final long[] curntGpa = new long[1];
        final int[] grade1 = {0};
        final int[] grade2 = { 0 };
        final int[] grade3 = { 0 };
        final int[] grade4 = { 0 };
        final int[] grade5 = { 0 };
        final int[] grade6 = { 0 };
        //Semester
        JLabel lblSmstr = new JLabel("> Enter how much semesters you had ");//first Label for user
        JTextField txtSmstr = new JTextField(3);//fill by user
        JButton btnSmstr = new JButton(">");//reach next step?
        frmMain.add(lblSmstr);
        frmMain.add(txtSmstr);
        frmMain.add(btnSmstr);


        btnSmstr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String semNum = txtSmstr.getText();
                int cmpare=Integer.parseInt(semNum);
                for (int i = 0; i < cmpare; i++) {
                    int arr[] = new int[i];
                    //grades
                    JLabel lblGrad = new JLabel("> Enter grades of semester "+i);
                    JTextField txtGrad1 = new JTextField(2);
                    JTextField txtGrad2 = new JTextField(2);
                    JTextField txtGrad3 = new JTextField(2);
                    JTextField txtGrad4 = new JTextField(2);
                    JTextField txtGrad5 = new JTextField(2);
                    JTextField txtGrad6 = new JTextField(2);
                    JButton btnGrad     = new JButton(">");
                    btnGrad.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            //grades from user
                            String s1= txtGrad1.getText();
                            String s2= txtGrad2.getText();
                            String s3= txtGrad3.getText();
                            String s4= txtGrad4.getText();
                            String s5= txtGrad5.getText();
                            String s6= txtGrad6.getText();
                            //save
                            //Check if frade <35 || >100
                            grade1[0] =Integer.parseInt(s1);
                            if (grade1[0]<35 || grade1[0]>100) {
                                JOptionPane.showMessageDialog(null, "Please RE-enter subject 1");
                            }
                            grade2[0] =Integer.parseInt(s2);
                            if (grade2[0]<35 || grade2[0]>100) {
                                JOptionPane.showMessageDialog(null, "Please RE-enter  subject 2");
                            }
                            grade3[0] =Integer.parseInt(s3);
                            if (grade3[0]<35 || grade3[0]>100) {
                                JOptionPane.showMessageDialog(null, "Please RE-enter subject 3");
                            }
                            grade4[0] =Integer.parseInt(s4);
                            if (grade4[0]<35 || grade4[0]>100) {
                                JOptionPane.showMessageDialog(null, "Please RE-enter subject 4");
                            }
                            grade5[0] =Integer.parseInt(s5);
                            if (grade5[0]<35 || grade5[0]>100) {
                                JOptionPane.showMessageDialog(null, "Please RE-enter subject 5");
                            }
                            grade6[0] =Integer.parseInt(s6);
                            if (grade6[0]<35 || grade6[0]>100) {
                                JOptionPane.showMessageDialog(null, "Please RE-enter subject 6");
                            }
                            //check grades
                            //save GPA in last semester
                            curntGpa[0] = (grade1[0] + grade2[0] + grade3[0] + grade4[0] + grade5[0] + grade6[0])/6;
                            JLabel gpaCurnt = new JLabel(String.valueOf(curntGpa[0]));
                            JLabel showGpa = new JLabel("..last semester GPA ");
                            //if all GPA is less than 35 it is fail
                            if (curntGpa[0] <35) {
                                JOptionPane.showMessageDialog(null, "you have failed, try HARD next time 0_-");
                            }
                            else {
                                frmMain.add(showGpa);
                                frmMain.add(gpaCurnt);
                                frmMain.setVisible(true);
                            }
                        }
                    });

                    //grades
                    frmMain.add(lblGrad);
                    frmMain.add(txtGrad1);
                    frmMain.add(txtGrad2);
                    frmMain.add(txtGrad3);
                    frmMain.add(txtGrad4);
                    frmMain.add(txtGrad5);
                    frmMain.add(txtGrad6);
                    frmMain.add(btnGrad);
                    frmMain.setVisible(true);
                }
            }
        });

        frmMain.setVisible(true);
    }
}
