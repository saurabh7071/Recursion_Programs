
// Array is sorted are not is Check with inbuilt isSorted() method

// isSorted(int[] array) is a static method of the ArrayUtils class that checks whether the array is sorted in
// natural order


package DSA_Recursion;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.ArrayUtils;

public class _17_isSorted_method {
    static boolean isSorted(int[] arr,int idx){
        return ArrayUtils.isSorted(arr);
    }
    public static void main(String[] args) {
        int [] arr={4,7,1,9};
        System.out.println(isSorted(arr,0));
    }
}
