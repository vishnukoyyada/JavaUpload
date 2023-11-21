package Recursion;

import java.util.*;
class Solution{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);

        System.out.println(subsetSums(arr));
    }
    static ArrayList<Integer>  subsetSums(ArrayList<Integer> arr){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =0;i<arr.size();i++){
            int temp =0;
            for(int j =i;j<arr.size();j++){
                temp+= arr.get(j);
                ans.add(temp);
            }
        }
        return ans;
        // code here
    }
}