package DSA_Recursion.java;

import java.util.Scanner;

public class _8_SumOfNaturalNumber {
    static int SimpleAddition(int n){
        if(n==0)return 0;
        return n + SimpleAddition(n-1);
    }
    static int WithAlternateSign(int m){
        if(m==0)return 0;
        if(m%2==0)return WithAlternateSign(m-1) - m;
        return WithAlternateSign(m-1) + m;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number for Addition : ");
        int  n=obj.nextInt();
        System.out.println(SimpleAddition(n));
        System.out.println("Enter the Number for Addition with alternate Sign : ");
        int m=obj.nextInt();
        System.out.println(WithAlternateSign(m));
    }
}
