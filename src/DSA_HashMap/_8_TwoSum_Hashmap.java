
// Best approach having complexity O(n) with the help of Hashmap

package DSA_HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class _8_TwoSum_Hashmap {
    public static void main(String[] args) {
        int[] nums = {14,5,10,4,5,9,2};
        int target=13;
        int[] ans = pairs(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] pairs(int[] nums, int target) {
        int n=nums.length;
        int[] ans = {-1};
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int partner = target - nums[i];
            if(mp.containsKey(partner)){
                ans = new int[]{i, mp.get(partner)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;
    }
}
