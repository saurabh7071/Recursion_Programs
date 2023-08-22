package DSA_Basic_Math;

public class _03_decimalToBinary_32Bit {
    public static void main(String[] args) {
        int n=45;
//        System.out.println(String.format("%32s",Integer.toBinaryString(n)).replaceAll(" ","0"));
        String binary = String.format("%32s",Integer.toBinaryString(n)).replaceAll(" ","0");
        System.out.println(binary);

    }
}
