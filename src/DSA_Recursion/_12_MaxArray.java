package DSA_Recursion;

import java.util.Scanner;

public class _12_MaxArray {
    static int MaxArray(int[] arr,int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int smallAns=MaxArray(arr,idx+1);
        return Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
//        int arr[]={2,5,1,7,9,4};
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=obj.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the element of an array : ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
//        for(int i=0;i<size;i++){
//            System.out.println(arr[i]);
//        }
        System.out.println("maximum element in array are : "+MaxArray(arr,0));
    }
}


// Iteration Method

// First Approach

//        System.out.println("Enter the size of an array : ");
//        int size=obj.nextInt();
//        int[] arr= new int[size];
//        System.out.println("Enter the element of an array : ");
//        for(int i=0;i<size;i++){
//        arr[i]=obj.nextInt();
//        }
//          for(int i=0;i<size;i++){
//            System.out.println(arr[i]);
//         }
//        int max=0;
//        for (int i = 0; i < size; i++){
//        max=Math.max(arr[i],max);
//        }
//        System.out.println("Maximum element are : "+max);

//    second Approach

//        int max=0;
//        for (int i = 0; i < size; i++) {
//              if(arr[i]>max) {
//              max=arr[i];
//              }
//        }