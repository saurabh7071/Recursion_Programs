package DSA_Recursion.java;

import java.util.Scanner;

public class _25_SumOfSubset {
    static void SumOfSubset(int[] arr,int idx,int length,int sum_of_subset){
        // base case
        if(idx >= length){
            System.out.println(sum_of_subset);
            return;
        }
        SumOfSubset(arr,idx+1,length,sum_of_subset + arr[idx]); // with adding current_index in sum_of_subset
        SumOfSubset(arr,idx+1,length,sum_of_subset);        // Without adding
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of an array : ");
        for(int i=0;i<size;i++){
            arr[i] = obj.nextInt();
        }
/*        for(int i=0;i<size;i++){
            System.out.println(arr[i]);
        }
        for(int element:arr){
            System.out.println(element);
        }
 */
        SumOfSubset(arr,0,arr.length,0);    // first of all sum_of_subset will pass zero
    }
}
