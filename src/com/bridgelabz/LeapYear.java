package com.bridgelabz;
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        year=sc.nextInt();

        if(year>=1582){
            if((year %4==0) && (year%100!=0 )|| (year%400==0)){
                System.out.println(year +" is Leap Year");
            }
            else {
                System.out.println(year +" is not Leap Year");
            }

        }
        else {
            System.out.println("Enter Valid Year");
        }
    }
}
