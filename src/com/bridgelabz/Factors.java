package com.bridgelabz;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,i,result=1;
        System.out.println("Enter Number: ");
        number=sc.nextInt();

        for(i=2;i<=number;i++){
            while (number%i==0){
                number=number/i;
                result=i*result;
                System.out.println(i);
            }
        }
        if(number>2){
            System.out.println(number);
            result *=number;
            System.out.println(result);
        }
        System.out.println(result);


    }
}
