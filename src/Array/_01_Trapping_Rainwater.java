package Array;

public class _01_Trapping_Rainwater {
    public static void main(String[] args) {
        int[] height = {4,2,0,6,3,2,5};
        trapwater(height);
    }
    private static void trapwater(int[] height) {
        int n = height.length;
        //Calculate leftMax boundry array
        int[] leftmax = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }
        for (int i:leftmax) System.out.println("leftmax["+i+"]");

        // calculate rightMax boundry array
        int[] rightmax = new int[n];
        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }
        for (int i:rightmax) System.out.println("rightmax["+i+"]");

        int waterlevel = 0, trapwater = 0;

        for (int i = 0; i < n; i++) {
            waterlevel = Math.min(leftmax[i], rightmax[i]);
            trapwater += (waterlevel-height[i]);
        }
        System.out.println("Water Level : "+waterlevel);
        System.out.println("Amount of trapped Water : "+trapwater);

    }
}
