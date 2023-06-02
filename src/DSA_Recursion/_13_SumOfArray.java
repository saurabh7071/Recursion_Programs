package DSA_Recursion.java;

import java.util.Scanner;

public class _13_SumOfArray {
    static int SumOfArray(int[] arr,int idx){
        if(idx == arr.length){
            return 0;
        }
        int smallAns=SumOfArray(arr,idx+1);
        return arr[idx]+smallAns;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size=obj.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the element of an array : ");
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        System.out.println(SumOfArray(arr,0));
    }
}

// Iterative Method

//    int sum=0;
//    for (int i = 0; i < size; i++) {
//        sum=sum+arr[i];
//    }
//    System.out.println(sum);

