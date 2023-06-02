
// Find the factorial of n numbers

package DSA_Recursion;
import java.util.Scanner;
public class _03_Factorial {
    static int fact(int n){
        //base case
        if(n==0)
            return 1;                        // fact(n-1)  --> recursive case
        return n*fact(n-1);                // sout(n)  --> self work
    }                                         // return n*fact(n-1);
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for find the factorial : ");
        int n=obj.nextInt();
        System.out.println(fact(n));
    }
}

/*
    Iterative method

    fact=1;
    int(int i=1;i<n;i++){
        fact=fact*i;
    }
    sout(fact);
*/