package DSA_Basic_Math;

public class _05_BinaryToDecimal {
    public static void main(String[] args) {
        int n=1111;
        int count=0;
        double ans=0;
        while(n!=0){
            // Sabse pahile least significance vala digit nikalna hai
            int digit = n%10;
            // agar LSB 1 hai to use 2 ki power jis bit no. pe hai vo number usko ans ke sath add karna hai
            if(digit == 1){
                ans = ans + Math.pow(2,count);
            }
            n/=10;
            count++;
        }
        System.out.println(ans);
    }
}
