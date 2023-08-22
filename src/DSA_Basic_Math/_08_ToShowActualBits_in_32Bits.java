package DSA_Basic_Math;

import java.util.ArrayList;

public class _08_ToShowActualBits_in_32Bits {
    public static void main(String[] args) {
        int n=11;
        toShowBits(n);                  // By using Array
        toShowBitsUsingArraylist(n);    // by using Arraylist
    }

    private static void toShowBits(int n) {
        int[] arr = new int[Integer.SIZE];
        for(int i=0;i<Integer.SIZE;i++){        // Integer.SIZE = 32
            if((n & 1) == 1) arr[i] = 1;
            else arr[i] = 0;
            n=n>>1;
        }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]);
        }
        System.out.println("\n");
    }

    private static void toShowBitsUsingArraylist(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<Integer.SIZE;i++){
            if((n & 1) == 1) list.add(1);
            else list.add(0);
            n=n>>1;
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i));
        }
    }
}
