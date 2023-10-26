package com.bridgelabz;
import java.util.*;
public class EuclideanDistance {
    public static void main(String[] args) {
        double x1,x2,y1,y2,n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1:");
        x1=sc.nextInt();
        System.out.println("Enter x2:");
        x2=sc.nextInt();
        System.out.println("Enter y1:");
        y1=sc.nextInt();
        System.out.println("Enter y2:");
        y2=sc.nextInt();

        n1=x2-x1;
        n2=y2-y1;

        double x=Math.pow( n1,2);
        double y=Math.pow( n2,2);

        double ed=Math.sqrt(x+y);

        System.out.println("Euclidean distance: "+ed);

    }
}
