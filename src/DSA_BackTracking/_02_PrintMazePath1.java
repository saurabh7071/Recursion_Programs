package DSA_BackTracking;

public class _02_PrintMazePath1 {
    private static int callcount=0;
    public static void main(String[] args) {
        int row=2;
        int column=3;
        printingPath(1,1,row,column," ");   // pass empty string
        System.out.println("number of calls : "+callcount);
    }

    private static void printingPath(int starting_row, int starting_column, int ending_row, int ending_column,String str) {
        callcount++;
        // base case
        if(starting_row > ending_row || starting_column > ending_column) return;
        if(starting_row == ending_row && starting_column == ending_column){
            System.out.println(str);
        }
        // for right            R -> Right
        printingPath(starting_row,starting_column+1,ending_row,ending_column,str+"R");
        // for down             D -> Down
        printingPath(starting_row+1,starting_column,ending_row,ending_column,str+"D");
    }
}
