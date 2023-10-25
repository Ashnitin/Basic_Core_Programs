package com.bridgelabz;

import java.util.Scanner;

public class PowerOf2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n,value=1;
        System.out.println("Enter no: ");
        n=sc.nextInt();
        if(n>=31){
            System.out.println("Number should be less than 31");
        }
        else{
            for (int i=1;i<=n;i++){
                value=value*2;
                System.out.println("value is: "+value);
            }
        }

    }
}
