package DSA_Basic_Math;

public class _02_decimalToBinary_toBinaryString_Method {
    public static void main(String[] args) {
        int n=45;
        decimalToBinary(n);
    }

    private static void decimalToBinary(int n) {
        System.out.println(Integer.toBinaryString(n));
    }
}
