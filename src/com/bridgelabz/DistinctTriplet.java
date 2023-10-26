package com.bridgelabz;

public class DistinctTriplet {
    public static void main(String[] args) {
        int arr[]={-1,-1,2,3,2};
        int count=0;
        for (int i=0;i<arr.length-2;i++){
            for (int j=i+1;j<arr.length-1;j++){
                for (int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println("Its Triplate");
                        count++;
                    }
                }
            }
        }
        System.out.println("Count is: "+count);
    }
}
