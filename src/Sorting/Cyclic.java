/*
 * Author:kvishnuv
 * Title: Cyclic sort
 * Time complexity O(n)
 * take a value and put it in a correct position if it is already at correct position then move the pointer or else keep changing
 * I think this algorithm is limited because  i think all elements should be from 1 to n  like continouous
 */

package Sorting;

import java.util.*;

public class Cyclic {
    public static void main(String[] args) {
        int[] arr = {3,4,1,2,5};
        cycle(arr);
        System.out.println(Arrays.toString(arr));

        
    }
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static void cycle(int[] arr){
        for(int i =0;i<arr.length;i++){
            if(arr[i]-1 != i){
                swap(arr,i,arr[i]-1);
            }else{
                continue;
            }

        }
    }
}
