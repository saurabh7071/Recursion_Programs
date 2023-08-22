package DSA_Basic_Math;

public class _06_ProblemCondingNinjas {
        public static long reverseBits(long n) {
            // Write your code here
            String binary = Long.toBinaryString(n);

            int length=binary.length();
            double ans=0;
            int count=30;

            if(binary.charAt(length-1) == '1')  // least significant bit means jo right most bit hota hai usko check karega
                ans = ans+Math.pow(2,31);   // ki kya o 1 hai or agar hai to ans calculate karega

            for(int i=length-2;i>=0;i--){
                if(binary.charAt(i) == '1'){     // ab us bit ko chod ke loop chalaya jayega MSB tak or jo jo 1 hai bas vahi
                    ans += 1<<count;            // liya jayega or usko ans me add kar diya jayega
                }
                count--;
            }
            return (long) ans;
        }
        public static void main(String[] args) {
            long n = 6;
            System.out.println(reverseBits(n));
        }
}


