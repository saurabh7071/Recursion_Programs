package DSA_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class _02_longest_consecutive_sequence {
    public static void main(String[] args) {
//        Scanner obj = new Scanner(System.in);
//        System.out.println("Enter the size of the array : ");
//        int size = obj.nextInt();
        int[] arr = {2,4,1,3,7,9,8};
        HashSet<Integer> st = new HashSet<>();
        checkConsecutive(st,arr);
    }

    private static void checkConsecutive(HashSet<Integer> st, int[] arr) {
        for (int element : arr)  st.add(element);
        int maxStreak=0;
        for(int num : st){
            if(!st.contains(num-1)){
                int currentNum = num;
                int currentStreak = 1;
                while(st.contains(currentNum+1)){
                    currentStreak++;
                    currentNum++;
                }
                maxStreak = Math.max(maxStreak,currentStreak);
            }
        }
        System.out.println(maxStreak);
    }
}
