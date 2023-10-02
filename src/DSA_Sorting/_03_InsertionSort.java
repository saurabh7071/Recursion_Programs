package DSA_Sorting;

public class _03_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,20,4,11,8,2};
        int n = arr.length;
        insertionSort(arr,n);
        for (int elements : arr) {
            System.out.print(elements + " ");
        }
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while(j>0 && arr[j] < arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
}
