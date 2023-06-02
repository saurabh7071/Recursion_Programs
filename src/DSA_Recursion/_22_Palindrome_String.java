
// Write a program to check the given string is palindrome or not ...

package DSA_Recursion.java;

import java.util.Scanner;

public class _22_Palindrome_String {

    // Approach 1 : with the help of index passing and checking with is equal to reverse string
    static String reverse_(String str,int idx){
        if(idx == str.length()) return "";              // Base case
        String smallAns=reverse_(str,idx+1);        // Recursive case
        return smallAns+str.charAt(idx);                // Self work
    }

    // Approach 2 : Two pointer Approach

    static boolean isPalindrome(String str,int left,int right){
        // Base case
        if(left >= right) return true;
        // Self work + Recursive case
        return (str.charAt(left) == str.charAt(right) && isPalindrome(str,left+1,right-1));
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any string to check it is palindrome or not ? ");
        String str = obj.nextLine();
        if(str.equals(reverse_(str,0))){
            System.out.printf("%s It is Palindrome String",str);
        } else {
            System.out.printf("%s It is not Palindrome String",str);
        }

        System.out.println("\n*******************************\n");

        System.out.println(isPalindrome(str,0,str.length()-1));     // time complexity : O(n)
    }
}
