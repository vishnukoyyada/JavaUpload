/*
 * Author: kvishnuv.
 * Tttle: Insertion sort.
 * insertion sort works in a way that select a element and put it in right place and then next select an other element and put in the next right place.
 * No stable algoritham.
 * Time complexity O(n^2) and constant space complexity.
 */

package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args){
        int[] nums= {4,3,2,5,1};
        int size = nums.length;
        for(int i =0;i<nums.length;i++){
            int secondnumber = size-i-1;
            int maximumnumber = maxi(nums, 0, secondnumber);
            swap(nums, maximumnumber, secondnumber);
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second]  = temp;

    }
    static int maxi(int arr[],int first,int last){
        int lar = first;
        for(int i=first;i<=last;i++){
            if(arr[lar]< arr[i]){
                lar = i;

            }
        }
        return lar;

    }

    
}
