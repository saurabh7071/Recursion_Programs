
// Program to find n number of fibonacci series
// Fibonacci series : The Fibonacci Series is a Series of number in which each number is the sum of two procceding numbers
// Fibonacci series be like ---> 0 1 1 2 3 5 8 13 21 34 55 ...............

package DSA_Recursion;
import java.util.Scanner;
public class _04_Fibonacci_Series {
    static int series(int n) {
        if(n==1 || n==0) return n;
        return series(n-1)+series(n-2);       // Recursive case + self work(addition of both recursive cases)
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number for fibonacci series :");
        int n = obj.nextInt();
        for (int i = 0; i <= n; i++) {
            System.out.println(series(i));
        }
    }
}

/*
    Iteration method
    a  +  b  =  c
    (0) + (1)  =  (1)
     1  +  1   =   2
     1  +  2   =   3            // Thinking
     2  +  3   =   5
     .     .       .
     .     .       .
     .     .       .

    int a=0,b=1,c;
    for(int i=1;i<n;i++){
        c=a+b;
        sout(c);
        a=b;b=c;
    }
 */