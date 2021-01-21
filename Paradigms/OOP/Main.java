package com.Assignment.Paradigms.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("enter name of man ");
        String name1 = s.nextLine();
        Names nam=new Names();
        nam.name = name1;
        nam.output();
    }

}
