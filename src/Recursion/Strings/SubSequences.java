package Recursion.Strings;

import java.util.ArrayList;


// 2 power length values are genrated;

public class SubSequences {
    public static void main(String[] args) {
        String  input = "abc";
        printsubequences(input,"");
        ArrayList<String> ans = new ArrayList<>();
        printsubequencesArray(input,"",ans);
        System.out.println(ans);
        System.out.println( printsubequencesArrayList(input,""));


    }

    private static ArrayList<String> printsubequencesArrayList(String input, String output) {
        if(input.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(output);
            return temp;

        }
       ArrayList<String>  left =  printsubequencesArrayList(input.substring(1),output+input.charAt(0));
        ArrayList<String>  right =printsubequencesArrayList(input.substring(1),output);
        left.addAll(right);
        return left;

    }

    private static void printsubequencesArray(String input, String output,ArrayList<String> ans) {
        if(input.isEmpty()){
            ans.add(output);
            return;
        }
     printsubequencesArray(input.substring(1),output+input.charAt(0),ans);
     printsubequencesArray(input.substring(1),output,ans);

    }

    private static void printsubequences(String input,String output) {
        if(input.isEmpty()){
            System.out.println(output);
            return;
        }
        printsubequences(input.substring(1),output+input.charAt(0));
        printsubequences(input.substring(1),output);
    }
}
