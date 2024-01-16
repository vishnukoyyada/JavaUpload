package Recursion.Strings;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        String in = "abc";
        printPermutations(in,"");
       // ArrayList<String> ans = new ArrayList<>();
       // printPermutations2(in,"",ans);
       // System.out.println(ans);
        //System.out.println(printPermutations3(in,""));
    }



    private static ArrayList<String> printPermutations3(String in, String output) {
        ArrayList<String> ans = new ArrayList<>();

        if (in.isEmpty()) {
            ans.add(output);
            return ans;
        }

        char ch = in.charAt(0);
        for (int i = 0; i <= output.length(); i++) {
            String first = output.substring(0, i);
            String second = output.substring(i);
            ans.addAll(printPermutations3(in.substring(1), first + ch + second));
        }

        return ans;
    }

    private static void printPermutations2(String in, String output, ArrayList<String> ans) {
        if(in.isEmpty()){
            ans.add(output);
            return;
        }
        char ch = in.charAt(0);
        for(int i =0;i<=output.length();i++){
            String first = output.substring(0,i);
            String second = output.substring(i);
            printPermutations2(in.substring(1),first+ch+second,ans);
        }
    }

    private static void printPermutations( String in,String output) {
        if(in.isEmpty()){
            System.out.println(output);
            return;
        }
        char ch = in.charAt(0);
        for(int i =0;i<=output.length();i++){
            String first = output.substring(0,i);
            String second = output.substring(i);
            printPermutations(in.substring(1),first+ch+second);
        }

    }
}
