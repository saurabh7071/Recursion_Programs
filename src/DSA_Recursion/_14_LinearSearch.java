package DSA_Recursion.java;

import java.util.Scanner;

public class _14_LinearSearch {


    //    True , False --> based on existence
    static boolean search(int[] arr, int n, int target, int idx)
    {
        if (idx >= n) return false;                  // base case
        if (arr[idx] == target) return true;         // self work
        return search(arr, n, target, idx + 1);      // Recursive case
    }


    //     return index of target if target present in array, otherwise return -1....
    static int findIndex(int[] a, int n, int find, int idx) {
        if (idx >= n) return -1;
        if (a[idx] == find) return idx;
        return findIndex(a, n, find, idx + 1);
    }


    //      given an array arr[] of size N and an integer X. The task is to find all the indices of the integer x in the
//         array..
    static void findAllIndex(int[] arr, int n, int target, int idx) {
        if (idx >= n) return;
        if (arr[idx] == target) System.out.println(idx);
        findAllIndex(arr, n, target, idx + 1);
    }


//    Find last index of target in array
    static int  findlastIndex(int[] arr,int n,int target){
        if(n <= 1) return -1;
        if(arr[n] == target) return n;
        return findlastIndex(arr,n-1,target);
    }

    public static void main(String[] args) {
        int[] arr = {9, 9, 15, 4, 4, 1, 2, 4, 49};
//        int[] arr={1,2,3};
        int target = 4;

//        if(search(arr,arr.length,target,0)){
//            System.out.println("yes,Found");
//        }
//        else {
//            System.out.println("No, Not Found");
//        }


//        System.out.println(findIndex(arr,arr.length,target,0));


//        findAllIndex(arr, arr.length, target, 0);

        System.out.println(findlastIndex(arr,arr.length-1,target));

    }
}



// Iterative Method

    /*
    Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
                int size=obj.nextInt();
                int[] arr= new int[size];
                System.out.println("Enter the element of an array : ");
                for(int i=0;i<size;i++){
        arr[i]=obj.nextInt();
        }
        System.out.println("Enter the target : ");
        int target=obj.nextInt();
        int flag=0;
        for (int i = 0; i < size; i++) {
        if(arr[i] == target){
        flag=1;
        break;
        }
        else{
        flag=0;
        }
        }
        if(flag == 1) System.out.println("yes");
        else System.out.println("NO");

     */