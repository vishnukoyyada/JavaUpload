package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
      int[] arr = {7,6,9,4,8,1};
      int[] res = merge(arr);
      System.out.println(Arrays.toString(res));

    }
    static int[] merge(int[] arr){
        if(arr.length ==1){
            return arr;
        }
        int mid = arr.length/2;
        int left[] = merge(Arrays.copyOfRange(arr,0,mid));
        int right[] = merge(Arrays.copyOfRange(arr,mid,arr.length));
        return conqueror(left,right);


    }
    private static int[] conqueror(int[] left, int[] right) {
        int[] newarray = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                newarray[k] = left[i];
                i++;
            } else {
                newarray[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            newarray[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            newarray[k] = right[j];
            j++;
            k++;
        }

        return newarray;
    }


}
