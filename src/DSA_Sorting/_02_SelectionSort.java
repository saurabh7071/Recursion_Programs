package DSA_Sorting;

public class _02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {7,4,1,3,8,2,6,5};
        selectionSort(arr);
        for (int e : arr) {
            System.out.print(e+" ");
        }
    }

    private static void selectionSort(int[] arr) {
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min_index = i;                      // i represent the current index
            for (int j = i + 1; j < n; j++) {       // Find the minimum element in the unsorted part of the array
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            // Swap current element and minimum element , swap(arr[i] , arr[min_index])
            int temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }
}
