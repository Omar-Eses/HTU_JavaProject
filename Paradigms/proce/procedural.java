package com.Assignment.Paradigms.proce;

import java.util.Scanner;

public class procedural {
    //this program will give you even numbers by procedural programming
    public static int ChecNum(int num){
        if (num % 2 == 0) {
            return num;
        }
        else
        return -1;
    }

    public static void main(String[] args) {
        int loops, inpNumber;
        Scanner num = new Scanner(System.in);
        System.out.print("Enter how much number you will enter: ");
        loops = num.nextInt();
        Scanner s1 = new Scanner(System.in);
        for (int i = 0; i < loops; i++){
            inpNumber = s1.nextInt();
            int number = ChecNum(inpNumber);
            if (number != -1)
                System.out.println("Number is Even");
            else
                System.out.println("Number is Odd");
        }
    }
}
