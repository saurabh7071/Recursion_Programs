package DSA_Basic_Math;

public class _07_ReverseBit {
    public static void main(String[] args) {
        long n = 1000;
        System.out.println(binarytodecimal(n));
        int m=-10;
        Reverse(m);
    }

    private static long binarytodecimal(long n) {
        double ans = 0;
        int count = 0;
        while (n != 0) {
            long digit = n % 10;
            if (digit == 1) ans += Math.pow(2, count);
            n /= 10;
            count++;
        }
        return (long) ans;
    }

    private static void Reverse(int m) {
        // This is for Reverse bit

//        int reverse=0;
//        while(m!=0){
//            reverse = reverse << 1;
//            if((m & 1) == 1) reverse = reverse ^ 1;
//            m=m>>1;
//        }

        // this is for the reverse bit in 32-bit

        int reverse=0;
        for(int i=0;i<32;i++){
            int bit = m & 1;
            int reverse1 = bit << (31-i);
            reverse=reverse | reverse1;
            m>>=1;
        }
        System.out.println(reverse);
    }
}
