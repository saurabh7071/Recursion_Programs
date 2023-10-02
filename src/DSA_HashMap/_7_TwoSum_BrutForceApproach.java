package DSA_HashMap;

// Brut force approach having complexity O(n^2)

import java.util.Arrays;

public class _7_TwoSum_BrutForceApproach {
    public static void main(String[] args) {
        int[] nums = {14, 5, 10, 4, 5, 9, 2};
        int target=13;
        int[] ans = pairs(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] pairs(int[] nums, int target) {
        int n=nums.length;
        int[] ans = {-1};
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if(nums[j] == target-nums[i]) {
                    ans = new int[]{i, j};
                    return ans;
                }
            }
        }
        return ans;
    }
}
