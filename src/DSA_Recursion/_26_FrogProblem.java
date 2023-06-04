
/*
    Question : There are N stones, numbered 0,1,2,3..........n-1. For each i(0<=i<N) the height of stone i is h.
               There is a frog who is initially on Stone 0. He will repeat the following action some number of times to
                reach stone n-1:
                                If the frog is currently on Stone i, jump to stone i+1 or stone i+2.
                                Here, a cost of |hi - hj| is incurred, where j is the stone to land on.

               Find the minimum possible total cost incurred before the frog reaches stone N.

                input n=4
                arr[] = 10 30 40 20
                Output = 30

 */
package DSA_Recursion;

public class _26_FrogProblem {
    static int MinimumCost(int[] arr,int size,int idx){
        if(idx == size-1) return 0;
        int operation1 = MinimumCost(arr,size,idx+1) + Math.abs(arr[idx] - arr[idx+1]);
        if(idx == size-2) return operation1;   
        int operation2 = MinimumCost(arr,size,idx+2) + Math.abs(arr[idx] - arr[idx+2]);
        return Math.min(operation1,operation2);
    }
    public static void main(String[] args) {
        int[] arr = {10,30,40,20};
        System.out.println(MinimumCost(arr,arr.length,0));
    }
}
