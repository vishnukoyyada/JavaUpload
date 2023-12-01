package Recursion.BackTracking;


import java.util.ArrayList;

public class DicePathDiagonal {
    public static void main(String[] args) {
       printpath("",3,3);
        System.out.println(printpath2("",3,3));;

    }
    private static void printpath(String op,int row, int col) {
        if(row ==1 && col ==1){
            System.out.println(op);
            return;
        }
        if(row>1 && col>1){
            printpath(op+"V",row-1,col-1);
        }
        if(row>1){
            printpath(op+"D",row-1,col);
        }
        if(col>1){
            printpath(op+"R",row,col-1);
        }

    }
   private static ArrayList<String> printpath2(String op, int row, int col) {
        ArrayList<String> ans = new ArrayList<>();
       if(row ==1 && col ==1){
           ans.add(op);
       }
       if(row>1 && col>1){
           ans.addAll(printpath2(op+"V",row-1,col-1));
       }
       if(row>1){
          ans.addAll(printpath2(op+"D",row-1,col));
       }
       if(col>1){
           ans.addAll(printpath2(op+"R",row,col-1));
       }

        return ans;
    }
}
