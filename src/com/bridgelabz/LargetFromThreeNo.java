package com.bridgelabz;

import java.util.Scanner;

public class LargetFromThreeNo {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no:");
        a=sc.nextInt();
        System.out.println("Enter Second no:");
        b=sc.nextInt();
        System.out.println("Enter Third no:");
        c=sc.nextInt();
        System.out.println("********* Three no are *********");
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("c= "+c);

        if(a>b && a>c){
            System.out.println("a is greater no: "+a);
        } else if (b>a && b>c) {
            System.out.println("b is greater no: "+b);
        }
        else {
            System.out.println("c is greater no: "+c);
        }

    }
}
