package DSA_Recursion.java;

import java.util.Scanner;

public class _11_PrintArray {
    static void PrintArray(int arr[],int index){
        if(arr.length == index) return;         // base case
            System.out.println(arr[index]);     // self work
            PrintArray(arr,index+1);      // Recursive case
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        Scanner obj = new Scanner(System.in);

        PrintArray(arr,0);

    }
}

// Iterative Method

//        System.out.println("Enter the size of an array : ");
//        int size=obj.nextInt();
//        int arrr[]= new int[5];
//        System.out.println("Enter the elements of an array : ");
//        for(int i=0;i<size;i++){
//        arrr[i]=obj.nextInt();
//        }
//        for(int i=0;i<size;i++){
//        System.out.println(arrr[i]);
//        }