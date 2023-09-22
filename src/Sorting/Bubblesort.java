package Sorting;

import java.util.Arrays;

public class  Bubblesort{
    public static void main(String[] args){
        int[] arr = {1,5,3,2,4};
        int[] arr2 = {1,2,3,5,4};
        bubles(arr2);
        bubles(arr);
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr));

    }
    static void bubles(int[] nums){
        int size = nums.length;
        boolean sorted;
        for(int i =0;i<size;i++){
            sorted = false;
            for(int j=1;j<size-i;j++){
                // why j is less than size-i because at each i stage  last  i elements will be sorted 
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j] = nums[j-1];
                    nums[j-1] = temp;
                    sorted = true;
                }

            }
            if(!sorted) break;
        }


    }
}