package DSA_Basic_Math;

import java.util.Scanner;

public class _01_decimalToBinary {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any decimal number to convert into binary : ");
        int num = obj.nextInt();

        DecimalToBinary(num);
    }

    private static void DecimalToBinary(int num) {
        int[] binary = new int[35];
        int count=0;
        while(num>0){               // for converting into binary and store into the array
            binary[count++]=num%2;
            num/=2;
        }
        for(int i=count-1;i>=0;i--){            // for printing the binary numbers
            System.out.print(binary[i]+" ");
        }
    }
}
