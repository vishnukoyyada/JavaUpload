package Recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int num = 1342;
        int result = sum(num,0);
        int result2 = sum2(num);
        System.out.println(result);
        System.out.println(result2);

    }

    private static int sum2(int num) {
        if (num ==0) return 0;
        return (num%10) + sum2(num/10);

    }

    private static int sum(int num,int sum) {
        if(num==0){
            return sum;
        }
        sum = sum +num%10;
        return sum(num/10,sum);
    }
}
