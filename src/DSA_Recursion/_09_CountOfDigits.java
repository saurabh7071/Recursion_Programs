
// Write a program to count the digits in a given number n.

package DSA_Recursion;
import java.util.Scanner;
public class _09_CountOfDigits {
    static int count=0;
    static int counting(long n){
        if(n>0){                                          // if(n<=9) return 1;
            count++;                                      //  return 1 + counting(n/10);
            counting(n/10);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of digits for count : ");
        long n=obj.nextLong();
        System.out.println(counting(n));
    }
}
