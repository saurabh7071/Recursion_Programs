package DSA_Recursion;

import java.util.Scanner;

public class _27_combination {
    static void combination(String digits,String[] kp,String currAns){
        // base case
        if(digits.length() == 0){
            System.out.print(currAns+" ");
            return;
        }
        // Convert the string into integer
        int currIdx = digits.charAt(0) - '0';
        String currChoice = kp[currIdx];    // mapping
        for(int i=0;i<currChoice.length();i++){
            combination(digits.substring(1),kp,currAns+currChoice.charAt(i));
        }
    }
    public static void main(String[] args) {
//        String digits = "27";
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the digits for combination : ");
        String digits = obj.nextLine();
//                      0   1   2     3     4     5     6     7      8      9
        String[] kp = {"", "","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        combination(digits,kp,"");
    }
}
