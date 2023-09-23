/*
 * Author:kvishnuv
 * Title: Insertion sort
 * Time complexity:O(n^2) auxiliary space constant
 * stable
 */
package Sorting;

import java.util.*;

public class Insertion {
    public static void main(String[] args){
        int[] arr = {4,3,2,5,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void insertion(int[] arr){
 
       for (int start=0;start<arr.length-1; start++){
        for(int j =start+1;j>0;j--){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }else{
                break;
            }
        }
        }

    }
}
