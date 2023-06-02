
// Write a Program to print reverse of a string using recursion

package DSA_Recursion;
import java.util.Scanner;
import java.lang.String;
public class _21_ReverseString {

    // Reverse the string using index      -----------> Time complexity : O(n^2)
    static String reverseString(String str, int idx){
        if(idx == str.length()) return "";                      // Base case
        String SmallAns = reverseString(str,idx+1);         // Recursive Case
        return SmallAns + str.charAt(idx);                      // Self work
    }

    // Reverse the string without index     -------------> Time complexity : O(n^2)
    static String reverse(String str){
        if(str.length() == 0) return "";
        String smallAns = reverse(str.substring(1));
        return smallAns + str.charAt(0);
    }

    // Reverse the String using two pointers    ---------------> Time Complexity : O(n)
    static String reverse1(String str,int l,int r){
//        if(l==r) return Character.toString(str.charAt(l)); ---> This is helpful for convert the char into the string
        if(l==r) return String.valueOf(str.charAt(l));      // it also can use for convert the char into the string
        if(l>=r) return "";
        String smallAns = reverse1(str,l+1,r-1);
        int temp = r;
        r=l;
        l=temp;
        return str.charAt(l)+smallAns+str.charAt(r);
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string : ");
        String str = obj.nextLine();
        // Method calling with the index number
        System.out.println("Reverse String are : "+reverseString(str,0));
        // Method calling without the index number
        System.out.println("Reverse String are without passing the index : "+reverse(str));

        int l=0;int r=str.length()-1;
        // Method calling with two pointers
        System.out.println("Reverse the string using two pointers : "+reverse1(str,l,r));
    }
}
