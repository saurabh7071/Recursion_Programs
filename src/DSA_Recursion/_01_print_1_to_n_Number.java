
// Write a program to print all natural numbers from 1 to n using recursion.

package DSA_Recursion.java;

import java.util.Scanner;
public class _01_print_1_to_n_Number {
    static int printing_number(int n)
    {
        if(n==1){                          //base case
            System.out.println(n);
            return 0;
        }
        printing_number(n-1);           //Recursive case
        System.out.println(n);              // Self Work
        return 0;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements for print : ");
        int n=obj.nextInt() ;
        printing_number(n);

        System.out.println("Saurabh vaidya");
    }
}
