package com.bridgelabz;

import java.util.Scanner;

public class EvenOddNo {
    public static void main(String[] args) {
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first no:");
        a=sc.nextInt();

        if(a%2==0){
            System.out.println("Even no: "+a);
        }
        else{
            System.out.println("Odd No: "+a);
        }
    }
}
