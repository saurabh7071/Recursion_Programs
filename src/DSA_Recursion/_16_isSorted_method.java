
// Program to check the array is sorted or not ...

package DSA_Recursion.java;

import java.sql.SQLOutput;
import java.util.Scanner;

public class _16_isSorted_method {
    static boolean isSorted(int[] arr,int n){
//        if(n == 1 || n== 0)  return true;                          // base case
//        if(arr[n-1] < arr[n-2]) return false;                       // self work
//        return isSorted(arr,n-1);                            // recursive case
//
        if(n >= arr.length-1) return false;                  // base case
        if(arr[n] > arr[n+1]) return true;                 // self work
        return isSorted(arr,n+1);                       // recursive case
        }

    public static void main(String[] args) {
        Scanner obj= new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = obj.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        if(isSorted(arr,0)){
            System.out.println("No, it is not sorted");
        }
        else {
            System.out.println("Yes , It is sorted");
        }
    }
}


// Iteration Method
/*
    int[] arr={1,2,3,4};
    int flag=0;
        for(int i=0;i<arr.length-1;i++){
        if(arr[i] > arr[i+1]){
        flag=1;
        }
        else flag=0;
        }
        if(flag ==1) System.out.println("It is not sorted");
        else System.out.println("It is sorted");
 */