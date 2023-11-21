package Recursion;

public class LinearSerach  {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int result = linearsearch(arr,3,0);
        System.out.println(result);
    }

    private  static  int linearsearch(int[] arr, int target, int index) {
    if(index == arr.length) return -1;
    if(arr[index]== target)
        return index;
    return  linearsearch(arr,target,index+1);
    }
}
