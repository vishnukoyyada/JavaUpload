/*
1.print first 10 Numbers
2.print last 10 numbers.
 */
package Recursion;


public class Numbers {
    public static void main(String[] args) {
        int n  = 10;
        reverse(n);
        for(int i=0;i<=n;i++){
            natural(i);
        }

    }

    private static void reverse(int n) {
        if(n <= 0){
            return;
        }
        System.out.println(n);
        reverse(n-1);
    }
    static void natural(int n){
        System.out.println("natural" + " " + n);

    }

}
