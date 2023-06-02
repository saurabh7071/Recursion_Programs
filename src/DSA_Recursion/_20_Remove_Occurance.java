
//  Remove all the occurrences of 'a' from string str .....


package DSA_Recursion.java;

import java.util.Scanner;

public class _20_Remove_Occurance {

    // Removing the occurrence with the help of idx number
    static String removeOccurance(String str,int idx){
        if(idx == str.length()) return "";                      // base case
        String SmallAns = removeOccurance(str,idx+1);       // Recursive case
        char current_char = str.charAt(idx);
        if(current_char != 'a'){                                // Self case
            return current_char + SmallAns;
        }
        else{
            return SmallAns;
        }
    }

//    Removing the occurrence without idx number
    static String removeOccurance1(String str){
        if(str.length() == 0) return "";                                    // Base case
        String SmallAns = removeOccurance1(str.substring(1));     // Recursive case
        char current_char = str.charAt(0);
        if(current_char != 'a'){                                            // Self work
            return current_char + SmallAns;
        }else{
            return SmallAns;
        }

    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str = obj.nextLine();

        System.out.println(removeOccurance(str,0));         // Time complexity : O(n^2)
        System.out.println(removeOccurance1(str));              // Time complexity : O(n^2)
    }
}
