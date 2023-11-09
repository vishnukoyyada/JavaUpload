package BitManipulation;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr = {2,3,4,3,2};
        int ans = duplicat(arr);
        System.out.println(ans);

    }

    public static int duplicat(int[] arr) {
        int unq = 0;
        for(int num:arr){
            unq = unq^num;
        }
        return unq;
    }

}
