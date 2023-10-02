package DSA_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class _9_LargestSubarray {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of an array : ");
        int size = obj.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements in an array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        System.out.println(ZeroSumLargestSubarray(arr));
    }

    private static int ZeroSumLargestSubarray(int[] arr) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        //    prefixSum   index

        int maxLength=0, prefixSum=0;
        mp.put(0, -1);  // agar kisi bar sum zero aata hai to map me jab hum check karenge ki pahile se map me key
                        // available hai kya or hongi to value overide kar denge isiliye hum pahile se hi zero insert karke rakh denge on -1 index
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (mp.containsKey(prefixSum)) {
                maxLength = Math.max(maxLength, i - mp.get(prefixSum));
            }
            else{
                mp.put(prefixSum,i);
            }
        }
        return maxLength;
    }
}
