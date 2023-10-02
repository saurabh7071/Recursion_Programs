package DSA_Sorting;

public class _01_bubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,7,6,5,4,3};
        sort(arr);
        for (int element : arr) {
            System.out.print(element+" ");
        }
    }
    static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {   // last i element are already at correct sorted position
            boolean flag = false;   // has any swapping happened
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag == false) return ;  // have any swaps happened ?
        }
    }
}
