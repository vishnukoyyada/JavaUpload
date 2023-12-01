package Recursion.Subsetspackages.Subsets;

import java.util.ArrayList;

public class DiceSum {
    public static void main(String[] args) {
        int num =4;
        printsums("",num);
        System.out.println(printsums2("",num));
    }

    private static ArrayList<String> printsums2(String s, int num) {
        ArrayList<String> ans = new ArrayList<>();
        if(num ==0){
            ans.add(s);
            return ans;
        }
        if(num<0){
            return ans;
        }
        for(int i =1;i<=6;i++){
          ArrayList<String> RE = printsums2(s+i,num-i);
          ans.addAll(RE);
        }
        return ans;
    }

    private static void printsums(String s, int num) {
        if(num<0){
            return;
        }
        if(num ==0){
            System.out.println(s);
            return;
        }
        for(int i =1;i<=6;i++){
            printsums(s+i,num-i);
        }
    }
}
