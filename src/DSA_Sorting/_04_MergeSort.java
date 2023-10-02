package DSA_Sorting;

public class _04_MergeSort {
    private static void MergeSort(int[] arr, int l, int r) {
        //Base case
        if(l==r) return;

        int mid = (l+r)/2;

        //Subproblems
        MergeSort(arr, l, mid);         // left halve
        MergeSort(arr,mid+1,r);       // Right halve
        //Selfwork
        Merge(arr, l, mid, r);
    }

    private static void Merge(int[] arr, int l, int mid, int r) {
        // Size of the subarrays
        int n1 = mid-l+1;
        int n2 = r-mid;
        // Subarrays
        int[] left = new int[n1];
        int[] right = new int[n2];
        // Copying elements in left[] and right[] subarrays from arr[]
        int i,j,k;
        for(i=0;i<n1;i++) left[i] = arr[l+i];
        for(j=0;j<n2;j++) right[j] = arr[mid+1+j];
        // now merge 2 sorted subarrays to creat an overall sorted array
        i=0;j=0;k=l;
        while (i < n1 && j < n2) {
            if(left[i] <= right[j]) arr[k++] = left[i++];
            else arr[k++] = right[j++];
        }
        //another condition -- if any one array will be out of bound
        while(i < n1) arr[k++] = left[i++];
        while(j < n2) arr[k++] = right[j++];
    }

    public static void main(String[] args) {
        int[] arr = {7,20,4,11,8,2};
        int n = arr.length;
        System.out.println("Array Before Sorting : ");
        display(arr);
        MergeSort(arr, 0, n - 1);
        System.out.println("\nArray After Sorting :");
        display(arr);
    }

    private static void display(int[] arr) {
        for(int element : arr){
            System.out.print(element + " ");
        }
    }
}
