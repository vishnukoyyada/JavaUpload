package Maths;

public class Lcm {
    public static void main(String[] args) {
         int a = 3,b =4;
        System.out.println(lcm(a,b));
    }

    private static int lcm(int a, int b) {
        return a*b/gcd(a,b);
    }

    private static int gcd(int a, int b) {
        int ans = 1;
        for(int i =2;i<=a;i++){
            if(a%i ==0 && b%i ==0){
                ans = i;
            }
        }
        return ans;
    }
}
