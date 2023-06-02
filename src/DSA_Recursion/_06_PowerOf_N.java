
// Given two numbers p and q. Find the value P^q using a recursive function
// p^q = p*p*p*p*p*p...................  ------> q times

package DSA_Recursion;
import java.util.Scanner;
public class _06_PowerOf_N {
    static int pow(int p,int q)
    {
        if(q==0)return 1;
//        return pow(p,q-1)*p;   -----> time complexity = O(n)

        int smallpow=pow(p,q/2);
        if(q%2==0){
            return smallpow * smallpow;      //   ----------------> O(log n)
        }                                    //            |
        else{                                //            |
            return smallpow * smallpow * p;  //   ---------|
        }

//      return pow(p,q/2) * pow(p,q/2);    --------> Time complexity = O(n)
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of p : ");
        int n=obj.nextInt();
        System.out.println("Enter the value of q : ");
        int m=obj.nextInt();
        System.out.println(pow(n,m));
    }
}
