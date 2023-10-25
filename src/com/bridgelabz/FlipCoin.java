package com.bridgelabz;

import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {
        int n,tail_count=0,head_count=0;
        double head,tail;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of time to flip coin: ");
        n=sc.nextInt();
        for (int i=1;i<=n;i++){
            double random = Math.random();
            if(random<0.5){
                tail_count++;
            }
            else {
                head_count++;
            }
        }
        head=(100/n)*head_count;
        tail=(100/n)*tail_count;
        System.out.println("Percentage of Head : "+head);
        System.out.println("Percentage of tail : "+tail);

    }
}
