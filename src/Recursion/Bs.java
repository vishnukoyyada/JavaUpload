package Recursion;

public class Bs {
    public static void main(String[] args) {
        System.out.println(binary(new int[]{4,8,9,11,12},12,0,4));
    }
    static int binary(int[] arr,int target, int start, int end){
        if(end <start){
            return -1;
        }
        int mid = start + (end-start/2);
        if(arr[mid] == target){
            return mid;
        } else if(arr[mid]> target) {
            return binary(arr,target,start,mid-1);
        }
        return binary(arr,target,mid+1,end);
    }
}
