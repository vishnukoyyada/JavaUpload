package Recursion.BackTracking;

public class DicePathallDirections {
    public static void main(String[] args) {
        boolean maze[][] = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        printpaths(0,0,maze," ");
    }

    private static void printpaths(int row, int col, boolean[][] maze,String op) {
        if(row ==maze.length-1 && col ==maze[0].length-1){
            System.out.println(op);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        maze[row][col] =false;
        if(row < maze.length-1){
            printpaths(row+1,col,maze,op+"D");
        }
        if(col <maze[0].length-1){
            printpaths(row,col+1,maze,op+"R");
        }
        if(row>0){
            printpaths(row-1,col,maze,op+"U");
        }
        if(col>0){
            printpaths(row,col-1,maze,op+"L");
        }
        maze[row][col] = true;

    }
}
