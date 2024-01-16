package Recursion.Arrays;

import java.util.ArrayList;

public class SubSequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printsubsequences(arr,new ArrayList<Integer>(),0);
    }

    private static void printsubsequences(int[] arr,ArrayList<Integer> op,int index) {
        if (index == arr.length) {
            System.out.println(op);
            return;
        }
        op.add(arr[index]);
        printsubsequences(arr, op, index + 1);
        op.remove(op.size() - 1);

        printsubsequences(arr, op, index + 1);

    }
}
