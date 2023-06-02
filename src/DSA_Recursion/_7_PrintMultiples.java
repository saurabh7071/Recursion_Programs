
// Printing the first n Multiples of p
// p=5 , n=4 ---> 5 , 10 , 15 , 20

package DSA_Recursion;
import java.util.Scanner;
public class _7_PrintMultiples {
    static void Print(int p,int q){
        // base case
        if(q==0)return;   // if (q==1) sout(p);  -->lekin is case me ek printing line extra aayegi jis vajah se
        //Recursive case                                                        execution time badhega
        Print(p,q-1);
        //self work
        System.out.println(p*q);
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number (P) : ");
        int n=obj.nextInt();
        System.out.println("Enter the Multiple value (n) : ");
        int m=obj.nextInt();
        Print(n,m);
    }
}


/*
        Iteration Method
        n=2 m=5
        for(int i=1;i<=m;i++)sout(n*m);
        ---> 2,4,6,8,10
 */