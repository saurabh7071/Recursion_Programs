package DSA_BackTracking;

public class _01_CountMazePath1 {
    private static int callcount=0;
     static int Maze(int starting_row, int starting_column, int ending_row, int ending_column) {
         callcount++;
         // base case
        if(starting_row > ending_row || starting_column > ending_column) return 0;
        if(starting_row == ending_row && starting_column == ending_column) return 1;
        // recursive case
        int downPath = Maze(starting_row+1,starting_column,ending_row,ending_column);
        int rightPath = Maze(starting_row,starting_column+1,ending_row,ending_column);
        // self work
        return downPath + rightPath;
    }
    public static void main(String[] args) {
        int row=2;
        int column=3;
        int count=Maze(1,1,row,column);
        System.out.println("Number of paths are : "+count);
        System.out.println("Number of calls are : "+callcount);
    }
}
