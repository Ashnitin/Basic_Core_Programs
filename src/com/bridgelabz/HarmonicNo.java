package com.bridgelabz;

import java.util.Scanner;

public class HarmonicNo {
    public static void main(String[] args) {
        int n ;
        double harmonicVal = 0,i,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number: ");
        n=sc.nextInt();
        for(i=1;i<=n;i++){
           harmonicVal=harmonicVal+(1/i);
            result=  harmonicVal;
        }
        System.out.println("Harmonic Value is : "+result);
    }
}
