
// Write a program to print all natural numbers from n to 1 using recursion.

package DSA_Recursion.java;

import java.util.Scanner;
public class _02_print_n_to_1_Number {
    static int printing(int n) {
        //base case
        if(n==1){
            System.out.println(n);
            return 0;
        }
        //Self work
        System.out.println(n);
        //Recursive case
        printing(n-1);
        return 0;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of 'n' : ");
        int n=obj.nextInt();
        printing(n);
    }
}
