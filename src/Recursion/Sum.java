package Recursion;

public class Sum {
    public static void main(String[] args) {
        int num = 10;
        int res = summation(num);
        System.out.println(res);


    }

    private static int summation(int num) {
        if(num ==0){
            return 0;
        }
        return num+summation(num-1);
    }
}
