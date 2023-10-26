package com.bridgelabz;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double temperature,speed,windchill;
        System.out.println("Enter Temperature: ");
        temperature=sc.nextDouble();
        System.out.println("Enter Speed: ");
        speed=sc.nextDouble();

        if(temperature<50 && speed<120 && speed>3){
            windchill=35.74+0.6215*temperature+(0.4275*temperature-35.75)*Math.pow(speed,0.16);
            System.out.println("Wind Chill is: "+windchill);
        }
        else {
            System.out.println("Note: the formula is not valid if t is larger than 50 in absolute value or if v is larger\n" +
                    "than 120 or less than 3");
        }
    }
}
