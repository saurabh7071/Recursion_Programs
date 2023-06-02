
// Check the number is prime or not and print the prime number upto 100 numbers

package DSA_Recursion;

public class _18_PrimeNumber {
    static int isPrime(int num,int n){
        if(num==0 || num==1) return 1;
        if(num == n) return 0;          // base case
        if(num%n == 0) return 1;        // self work
        return isPrime(num,n+1);      // Recursive work
    }
    public static void main(String[] args) {
//        int n=2;
//        if(isPrime(n,2) == 0) System.out.println(n+" is prime Number");
//        else System.out.println(n+" is not prime Number");

        for(int i=1;i<=100;i++){
            if(isPrime(i,2) == 0){
                System.out.println(i);
            }
        }
    }
}


// Iterative Approach
/*
    static int primeNubmer(int num,int n){

        if(num==0 || num==1) return 1;

        for(int i=2;i<num;i++){
            if(num%i==0) return 1;
        }
        return 0;

        public static void main(String[] args) {
            for(int i=100;i>1;i--){
                if(primeNubmer(i,2)==0) {
                    System.out.println(i);
                }

 */