
/* Given an integer array arr, move all 0's to the end of it while maintaining the relative order of
  the non-zero elements...
  Note that you must do this in-place without making copy of the array

  input : 0 5 0 3 42
  output : 5 3 42 0 0

 */

package DSA_Sorting;


public class _05_Problem1 {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 42};
        int n = arr.length;
        helper1(arr,n);
        for(int elements : arr){
            System.out.print(elements + " ");
        }
    }

    private static void helper1(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(arr[j] == 0 ){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
