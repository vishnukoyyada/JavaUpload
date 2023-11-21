package Maths;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Factors {
    public static void main(String[] args) {
         int n = 20;
         result1(n);
        System.out.println(" ");
         result(n);
    }

    private static void result(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =1;i<=(int)Math.sqrt(n);i++){
            if(n%i ==0){
                if(n/i == i){
                    ans.add(n/i);
                }else{
                    ans.add(i);
                    ans.add(n/i);
                }

            }
        }
        Collections.sort(ans);
        System.out.println(ans.toString());
    }

    private static void result1(int n) {
        for(int i =1;i<=n;i++){
            if(n%i ==0)
                System.out.print(i +" ");
        }
    }
}
