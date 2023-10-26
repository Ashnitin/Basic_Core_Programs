package com.bridgelabz;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int arr[][]=new int[2][3];
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Element of array: ");
        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("**********Two Dimentional Array is**************\n");
        for(int i=0;i<2;i++){
            for (int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
