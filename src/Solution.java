import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 8, 9};
        int[] arr2 = {2, 4, 6, 7, 8, 9,10};
        uniquearr1(arr1, arr2);
        uniquearr2(arr1, arr2);
    }

     static void uniquearr1(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr1) {
            if (!contains(arr2, num))
                ans.add(num);
        }
        System.out.println(ans);
    }

    static void uniquearr2(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int num : arr2) {
            if (!contains(arr1, num))
                ans.add(num);
        }
        System.out.println(ans);
    }

   static boolean contains(int[] arr, int target) {
        for (int num : arr) {
            if (num == target)
                return true;
        }
        return false;
    }
}
