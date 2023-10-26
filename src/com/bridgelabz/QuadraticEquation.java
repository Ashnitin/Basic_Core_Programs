package com.bridgelabz;
import java.util.Scanner;
public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.println("Enter a: ");
        a=sc.nextDouble();
        System.out.println("Enter b: ");
        b=sc.nextDouble();
        System.out.println("Enter c: ");
        c=sc.nextDouble();

        double delta= (b * b) - (4 * a * c);
        double root1=(-b + Math.sqrt(Math.abs(delta)))/(2*a);
        double root2= (-b - Math.sqrt(Math.abs(delta)))/(2*a);

        System.out.println(root1);
        System.out.println(root2);
    }
}
