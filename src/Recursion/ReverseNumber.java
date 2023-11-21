package Recursion;

import static java.lang.Integer.reverse;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int result = reverse(num,0);
        System.out.println(result);
    }

    private static int reverse(int num,int reverse) {
        if(num<=0){
            return reverse;
        }
        reverse= reverse*10+num%10;
       return  reverse(num/10,reverse);

    }
}
