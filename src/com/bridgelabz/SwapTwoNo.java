package com.bridgelabz;

import java.util.Scanner;

public class SwapTwoNo {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no:");
        a=sc.nextInt();
        System.out.println("Enter second no:");
        b=sc.nextInt();
        int temp=0;
        System.out.println("First no is:"+a);
        System.out.println("Second no is:"+b);
        temp=a;
        a=b;
        b=temp;
        System.out.println("*****After Swapping********");
        System.out.println("First no is:"+a);
        System.out.println("Second no is:"+b);

    }
}
