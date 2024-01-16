package Recursion.Arrays;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printPermutations(arr, new ArrayList<>(), new boolean[arr.length]);
    }

    private static void printPermutations(int[] arr, ArrayList<Integer> op, boolean[] used) {
        if (op.size() == arr.length) {
            System.out.println(op);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                op.add(arr[i]);
                used[i] = true;
                printPermutations(arr, op, used);
                op.remove(op.size() - 1);
                used[i] = false;
            }
        }
    }
}
