package DSA_Recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _15_Arraylist {
    static ArrayList<Integer> allIndices(int[] arr,int n,int target,int idx){
        if(idx >= n) return new ArrayList<Integer>();   // return empty arraylist

        ArrayList<Integer> ans = new ArrayList<>();

        if(arr[idx] == target) ans.add(idx);
        ArrayList<Integer> smallAns= allIndices(arr,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={4,4,2,7,4,4,1};
        int target=4;
        ArrayList<Integer> ans = allIndices(arr,arr.length,target,0);
        System.out.println(ans);
//        for(int i:ans) System.out.println(i);
    }
}
