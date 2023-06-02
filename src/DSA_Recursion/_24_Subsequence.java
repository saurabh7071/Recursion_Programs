package DSA_Recursion;

public class _24_Subsequence {
    static void Subsequences(String str,String current_ans){

        // base case
        if(str.length() == 0){
            System.out.println(current_ans);
            return;
        }

        char current_char = str.charAt(0);
        String remaining_string = str.substring(1);

        // recursive case + self work

        // if current_char chooses to be part of current_ans
        Subsequences(remaining_string,current_ans+current_char);    // with current_char , including curr_char

        // if current_char does not choose to be a part of current_ans
        Subsequences(remaining_string,current_ans);                         // without current_char , excluding curr_char
    }
    public static void main(String[] args) {
        Subsequences("abc","");

    }
}
