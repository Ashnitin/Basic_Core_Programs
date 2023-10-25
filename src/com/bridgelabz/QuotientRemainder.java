package com.bridgelabz;

import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        int dividend,divisor;
        double q,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter dividend : ");
        dividend=sc.nextInt();
        System.out.println("Enter divisor: ");
        divisor=sc.nextInt();
        q=dividend/divisor;
        r=dividend%divisor;
        System.out.println("Quoteint is : "+q);
        System.out.println("Remainder is : "+r);

    }
}
