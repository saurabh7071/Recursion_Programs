
// Given an integer, find out the sum of its digits using recursion...
// 3452 ---> 3+4+5+2 = 14

package DSA_Recursion;
import java.util.Scanner;
public class _05_SumOfDigits {
    static int Addition(int n){
        if(n>=1 && n<=9)return n;               //base case
        return Addition(n/10) + n%10;       // Recursive call(Addition(n/10)) and self work(Addition of n%10)
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the digits for addition : ");
        int n=obj.nextInt();
        System.out.println(Addition(n));
    }
}

/*
        Iteration method

        int sum=0;
            while(n!=0){                          for(int i=1;i<=n;i++){    ye wrong honga ...... :)
            sum=sum+n%10;                         sum=sum+n%10;
            n=n/10;                               n=n/10;
            }                                      }
        System.out.println(sum);
 */