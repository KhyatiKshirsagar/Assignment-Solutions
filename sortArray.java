package com.assignment;

import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter elements in an array");
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("After sorting array");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
