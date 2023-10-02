package DSA_HashSet;

import java.util.HashSet;

public class _3_MaxPair {
    public static void main(String[] args) {
        int[] arr = {3,3,2,7,9,9,2,2,7,5,7,5,3};
        System.out.println(longestPair(arr));
    }

    private static int longestPair(int[] arr) {
        HashSet<Integer> table = new HashSet<>();
        int max=0;
        for (int num : arr) {
            if (table.contains(num)) {
                table.remove(num);
            }else{
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;  // 3
    }
}
