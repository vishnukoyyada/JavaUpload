package Recursion.BackTracking;

public class DiceSum {
    public static void main(String[] args) {
        System.out.println(count(3,3));
    }

    private static int count(int row, int col) {
        if(row <=1 || col <=1) return 1;
        int right = count(row,col-1);
        int down = count(row-1,col);
        return down+right;
    }
}
