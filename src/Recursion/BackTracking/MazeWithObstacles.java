package Recursion.BackTracking;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        printPaths("",maze,0,0);
        PrintPaths2("op",maze,0,0);

    }

   private static void PrintPaths2(String op, boolean[][] maze, int row, int column) {

    }

    private static void printPaths(String op, boolean[][] maze, int row, int col) {
        if(row== maze.length-1 && col == maze[0].length-1){
            System.out.println(op);
        }
        if(!maze[row][col]){
            return;
        }
        if(row < maze.length-1){
            printPaths(op+"D",maze,row+1,col);
        }
        if(col < maze[0].length-1){
            printPaths(op+"R",maze,row,col+1);
        }

    }

}
