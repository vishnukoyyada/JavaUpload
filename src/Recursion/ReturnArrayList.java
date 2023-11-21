package Recursion;

import java.util.ArrayList;

public class ReturnArrayList {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        ArrayList<Integer> ans = findindex(arr,2,0);
        System.out.println(ans);
    }

    private static ArrayList<Integer> findindex(int[] arr, int target,int index) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr.length == index) return ans;
        if(arr[index] == target) ans.add(index);
        ArrayList<Integer> ansfromcalls = findindex(arr, target, index + 1);
        ans.addAll(ansfromcalls);

        return ans;
    }
}
