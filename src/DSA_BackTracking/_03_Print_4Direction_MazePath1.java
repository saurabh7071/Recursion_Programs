package DSA_BackTracking;

public class _03_Print_4Direction_MazePath1 {
    private static int callcount=0;
    private static void PrintingPath(int starting_row, int starting_column, int ending_row, int ending_column, String str,boolean[][] isVisited){
        callcount++;
        if(starting_row < 0 || starting_column < 0) return;                      // base case for left and up direction
        if(starting_row > ending_row || starting_column > ending_column) return; // base case for right and down direction
        if(isVisited[starting_row][starting_column] == true) return ;
        if(starting_row == ending_row && starting_column == ending_column){
            System.out.println(str);
            return;
        }
        // sabse pahile vo false rahne vala hai checkmark usake  bad hum visited pe true mark kar denge
        isVisited[starting_row][starting_column] = true;            // make the checkmarks ---> checked
        PrintingPath(starting_row,starting_column+1,ending_row,ending_column,str+"R",isVisited);  // for right
        PrintingPath(starting_row+1,starting_column,ending_row,ending_column,str+"D",isVisited);     // for down
        PrintingPath(starting_row,starting_column-1,ending_row,ending_column,str+"L",isVisited);  // for left
        PrintingPath(starting_row-1,starting_column,ending_row,ending_column,str+"U",isVisited);    // for up
        isVisited[starting_row][starting_column] = false;           // Backtracking --> unchecked
    }
    public static void main(String[] args) {
        int row=2;
        int column=3;
        boolean[][] isVisited = new boolean[row][column];
        PrintingPath(0,0,row-1,column-1,"",isVisited);
        // here we make a boolean type of array that's why we call the function from 0 to size-1 ....
        System.out.println("Number of call are : "+callcount);
    }
}
