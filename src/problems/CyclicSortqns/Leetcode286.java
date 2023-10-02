package problems.CyclicSortqns;

import java.util.Arrays;

public class Leetcode286{
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int ans = missingNumber(arr);
        System.out.println(ans);
        
    }
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i =0;i<nums.length;i++){
            if(i != nums[i]) return i;
        }
        return nums.length;
    }
}
