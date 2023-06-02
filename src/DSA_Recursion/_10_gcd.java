
// Write a Program to Find GCD

package DSA_Recursion.java;

import java.util.Scanner;

public class _10_gcd {
    static int gcd(int x, int y){               // Recursive Approach
        if(y == 0) return x;
        return gcd(y,x%y);                  //  Euclid's Algorithm
    }
    static int gcd1(int x, int y){
        while(x%y!=0){                      // Iterative Approach
            int rem=x%y;
            x=y;                            // Long-Division Method
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of x : ");
        int x=obj.nextInt();
        System.out.println("Enter the value of y : ");
        int y=obj.nextInt();
        System.out.println("Euclid's Algorithm - GCD : "+gcd(x,y));
        System.out.println("Long Division Method - GCD : "+gcd1(x,y));
    }
}

//      Iterative Method

// public class Practice {
//    static void prac(int n, int m) {
//        int small;
//        if (n < m) small = n;
//        else small = m;
//
//        for (int i = small; i > 0; i--) {
//            if (n % i == 0 && m % i == 0) {
//                System.out.println("GCD : " + i);
//                break;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the value of n : ");
//        int n = obj.nextInt();
//        System.out.println("Enter the value of m : ");
//        int m = obj.nextInt();
//        prac(n, m);
//    }
//}