package Recursion;

public class Patterns {
    public static void main(String[] args) {
        int n = 4;
       method1(n);
        method2(n,0);
        method3(n,0);
    }

    private static void method3(int n, int column) {
        if(n ==0){
            return;
        }
        if(column<n){
            method2(n,column+1);
            System.out.print("*");
        }else{
            method2(n-1,0);
            System.out.println();
        }
    }

    private static void method2(int n,int column) {
        if(n ==0){
            return;
        }
        if(column<n){
            System.out.print("*");
            method2(n,column+1);
        }else{
            System.out.println();
            method2(n-1,0);
        }
    }

    private static void method1(int n) {
        for (int i = 0; i < n; i++) {
            for(int j =0;j<n-i;j++){
                System.out.print("*"+ " ");
            }
            System.out.println();

        }
    }
}
