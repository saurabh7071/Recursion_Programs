package DSA_Basic_Math;

public class _04_decimalToBinary_WithoutStoringInArray {
    public static void main(String[] args) {
        int n=15;
        int Binary_number=0,count=0;
        while(n>0){
            int rem=n%2;
            double c=Math.pow(10,count);    // imp case ---> need to understand properly (datatype should be noticed)
            double container = rem*c;
            Binary_number+=container;
            n/=2;
            count++;
        }
//        System.out.println(Binary_number);
        for(int i=31;i>=0;i--){
            System.out.print(Binary_number);
        }
    }


    // Time complexity : O(Log2(n))
}
